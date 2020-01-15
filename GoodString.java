//Problem Statement - https://www.hackerearth.com/codemonk-arrays-strings/algorithm/little-monk-and-good-string/


import java.util.Scanner;

/**
 * Created by admin on 24-Oct-16.
 */
public class GoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=1,length=0;

        for (int i=0;i<str.length()-1;i++) {
            if ((str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') && (str.charAt(i+1) == 'a' || str.charAt(i+1) == 'e' || str.charAt(i+1) == 'i' || str.charAt(i+1) == 'o' || str.charAt(i+1) == 'u')) {
                count++;
                if (count>length) {
                    length=count;
                }
            } else
                count = 1;
        }
        System.out.println(length);
    }
}
