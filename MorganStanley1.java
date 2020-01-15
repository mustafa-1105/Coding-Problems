import java.util.Scanner;

/**
 * Created by admin on 06-Aug-16.
 */
//Problem Statement - https://www.hackerrank.com/contests/morgan-stanley-2016/challenges/jesse-and-profit

public class MorganStanley1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        int i = 0;

        while (i<d) {
            int profit = Integer.parseInt(sc.nextLine()); //profit required
            int min = n-1; // assumed the max days required
            int buyed = 0;
            int sold = 0;

            for (int j=0;j<n-1;j++) {
                for (int k=j+1;k<n;k++) {
                    if (arr[k]-arr[j] == profit && min >= (k-j)) {
                        min=k-j;
                        buyed = j+1;
                        sold = k+1;
                    }
                }
            }
            i++;
            if (buyed == 0 && sold == 0) {
                System.out.println("-1");
            }
            else {
                System.out.println(buyed +" " + sold);
            }
        }
    }
}
