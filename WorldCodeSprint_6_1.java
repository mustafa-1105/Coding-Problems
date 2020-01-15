import java.util.Scanner;

/**
 * Created by admin on 27-Aug-16.
 */

//Problem Statement - https://www.hackerrank.com/contests/world-codesprint-6/challenges/bon-appetit
public class WorldCodeSprint_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int b_actual = 0;
        int b_charged = 0;

        for (int i=0;i<n;i++) {
            if (i!=k) {
                b_actual = b_actual + sc.nextInt();
            }
        }
        b_actual = b_actual/2;
        sc.nextLine();
        b_charged = sc.nextInt();
        sc.nextLine();
        if (b_actual != b_charged) {
            System.out.println(b_charged-b_actual);
        }
        else {
            System.out.println("Bon Appetit");
        }

    }
}
