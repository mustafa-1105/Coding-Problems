//Problem Statement - https://www.hackerearth.com/codemonk-arrays-strings/algorithm/monk-and-welcome-problem/


import java.util.Scanner;

/**
 * Created by admin on 24-Oct-16.
 */
public class WelcomeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        sc.nextLine();

        for (int i=0;i<n;i++) {
            b[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++) {
            System.out.print(a[i]+b[i]+" ");
        }

    }
}
