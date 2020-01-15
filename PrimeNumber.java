import java.util.Scanner;

/**
 * Created by admin on 20-Jan-17.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0;i<cases;i++) {
            sc.nextLine();
            int flag = 0;
            int n = sc.nextInt();
            for (int j=2;j<n/2;j++) {
                if (n%j == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("UNOCOIN "+n);
            }
            else {
                System.out.println("NOT_UNOCOIN");
            }
        }

    }
}
