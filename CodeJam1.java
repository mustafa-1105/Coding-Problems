import java.util.Scanner;

/**
 * Created by mustafa on 12/6/16.
 */

//Problem - Statement -  https://code.google.com/codejam/contest/8274486/dashboard

public class CodeJam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());

        for (int i=0;i<cases;i++) {
            int n = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            String[] splitstr = str.split(" ");
            int[] price = new int[2*n];

            for (int j=0;j<2*n;j++) {
                price[j] = Integer.parseInt(splitstr[j]);
            }

            System.out.print("Case #"+(i+1)+": ");
            for (int j=0;j<2*n;j++) {
                int scan = 0;
                if (price[j] != 0) {
                    while ( price[j+scan] != ( price[j] + ( price[j] / 3 ) ) ) {
                        scan++;
                    }
                    System.out.print(price[j] + " ");
                    price[j] = 0;
                    price[j+scan] = 0;
                }
            }
            System.out.println();
        }
    }
}
