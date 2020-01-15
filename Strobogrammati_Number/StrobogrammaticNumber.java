package Strobogrammati_Number;

import java.util.HashMap;
import java.util.Scanner;

public class StrobogrammaticNumber {
    public static HashMap<Character, Character> map = new HashMap<Character, Character>();

    public static boolean isStrobogrammaticNumber(String number) {
        if (number == null || number.length() == 0)
            return true;

        int left = 0;
        int right = number.length()-1;
        while (left <= right) {
            if (
                     !map.containsKey(number.charAt(left))
                  || (number.charAt(right) != map.get(number.charAt(left)))
            )
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        for (long i=(long)(Math.pow(10, n-1)-1); i<(Math.pow(10, n)-1); i++) {
            if (isStrobogrammaticNumber(Long.toString(i)))
                System.out.print(i + " ");
        }
    }
}
