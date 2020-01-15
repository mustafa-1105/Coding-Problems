import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 17-Dec-17.
 */
public class SchoolPrayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int n = 0;
        int count = 0;
        int temp = 0;
        t = sc.nextInt();
        for (int i=0; i<t; i++) {
            n = sc.nextInt();
            ArrayList arrayList = new ArrayList();
            count = 0;
            for (int j=0; j<n; j++) {
                temp = sc.nextInt();
                int k = temp-1;
                while ((!arrayList.contains(k)) && (k>0)){
                    k--;
                }
                if (k==0) {
                    count -= 1;
                } else {
                    count += k;
                }
                arrayList.add(temp);
            }
            System.out.println(count);
            sc.nextLine();
        }
    }
}
