//Problem Statement - https://www.hackerearth.com/codemonk-arrays-strings/algorithm/monk-teaches-palindrome/


import java.util.Scanner;

/**
 * Created by admin on 24-Oct-16.
 */
public class PalindromeWithLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        String s1,reverse;
        int length;
        for (int j=0;j<cases;j++) {
            s1 = sc.nextLine();
            reverse="";
            length = s1.length();
            for ( int i = length - 1; i >= 0; i-- ) {
                reverse = reverse + s1.charAt(i);
            }
System.out.println(reverse);

            if (s1.equals(reverse)) {
                if (length % 2 == 0)
                    System.out.println("YES EVEN");
                else
                    System.out.println("YES ODD");
            }
            else
                System.out.println("NO");
        }
    }
}
