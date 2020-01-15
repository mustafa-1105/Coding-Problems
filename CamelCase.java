//Problem - statement - https://www.hackerrank.com/contests/world-codesprint-5/challenges/camelcase

import java.util.Scanner;

/**
 * Created by admin on 24-Jul-16.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int n = chars.length;
        int count = 1;

        for(int i=1;i<n;i++) {
            if(chars[i]>=65 && chars[i]<=90){
                count++;
            }
        }
        System.out.println(count);
    }
}
