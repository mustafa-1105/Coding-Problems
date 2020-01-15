//Problem Statement  - https://www.hackerrank.com/contests/sears-dots-arrows/challenges/balanced-subsequence



import java.util.Scanner;

/**
 * Created by admin on 23-Oct-16.
 */
public class BalancedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        String input;
        int countL = 0;
        int countR = 0;

        for (int i=0;i<cases;i++) {
            input = sc.nextLine();
            for (int j=0;j<input.length();j++) {
                if (input.charAt(j) == '(') {
                    if (j != 0 && input.charAt(j-1) == ')') {
                        countL = 1;
                    } else {
                        countL++;
                    }

                }
                if (countL > 0 && input.charAt(j) == ')') {
                    countR++;
                    countL--;
                }
            }
            System.out.println(countR*2);
            countR = 0;
            countL = 0;
        }
    }
}
