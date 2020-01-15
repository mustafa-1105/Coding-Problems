// problem - Statement - https://www.hackerrank.com/contests/world-codesprint-5/challenges/string-construction

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by admin on 24-Jul-16.
 */
public class StringConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        int cost = 0;

        for(int i=0;i<cases;i++) {
            String str = sc.nextLine();
            String p = new String();
            Set<Character> chars = new HashSet<Character>();
            chars.add(str.charAt(0));
            p=p+str.charAt(0);  //adding 1st char
            cost = 1;
            boolean exists;
            for(int scan=1;scan<str.length();scan++) { //scanning from 2nd to nth char of given string
                exists = chars.contains(str.charAt(scan));
                if (exists == true) {
                    chars.add(str.charAt(scan));
                }
                else {
                    chars.add(str.charAt(scan));
                    cost = cost + 1;
                }
            }
            System.out.println(cost);
        }
    }
}
