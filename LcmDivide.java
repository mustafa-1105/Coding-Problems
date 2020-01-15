//Problem Statement -  https://www.hackerrank.com/contests/sears-dots-arrows/challenges/the-easy-puzzle-1


import java.util.Scanner;

/**
 * Created by admin on 23-Oct-16.
 */
public class LcmDivide {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return (gcd (b, a % b));
    }

    private static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        int n,k;
        for (int i=0;i<cases;i++) {
            n=sc.nextInt();
            k=sc.nextInt();
            sc.nextLine();
            //int numbers[] = new int[n];

            int result=sc.nextInt();

            for (int j=1;j<n;j++) {
                //numbers[j] = sc.nextInt();
                result = lcm(result,sc.nextInt());
            }

            if (result%k == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
