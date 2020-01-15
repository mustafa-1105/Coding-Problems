import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 16-Sep-18.
 */
public class VegetableMarket {
    public static int n;
    public static int[] quan;
    public static int k = 0;

    public static boolean CanBuyMinVeg(int j) {
        int totalForJ = 0;
        boolean result = false;
        for (int i=0; i<n; i++) {
            if (quan[i] < j){
                totalForJ += quan[i];
            } else {
                totalForJ += j;
            }
            if (totalForJ >= k) {
                result = true;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        quan = new int[n];
        int total = 0;
        for (int i=0; i<n; i++) {
            quan[i] = sc.nextInt();
            total += quan[i];
        }
        Arrays.sort(quan);

        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            k = sc.nextInt();
            if (k > total) {
                System.out.println("-1");
                continue;
            }

            for (int j=1; j<quan[n-1]; j++) {
                if (CanBuyMinVeg(j)) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
