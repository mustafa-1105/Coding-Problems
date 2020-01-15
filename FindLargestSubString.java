import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by admin on 26-Jan-19.
 */
public class FindLargestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();
        int []arr = new int[size];
        String strArr = sc.nextLine();
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int maxLength = 0;
        int currLength = 0;

        for (int i=0; i<size; i++) {
            if (strArr.charAt(i) == '0')
                sum++;
            else
                sum--;

            // If sum is positive, then maximum
            // length substring is bin[0..i]
            if (sum > 0) {
                maxLength = i + 1;
            }
            // If sum is negative, then maximum
            // length substring is bin[j+1..i], where
            // sum of substring bin[0..j] is sum-1.
            else if (sum <= 0) {
                //System.out.println(sum + " " + maxLength + " " + currLength);
                if (map.containsKey(sum-1)) {
                    currLength = i - map.get(sum - 1);

                    if (currLength > maxLength)
                        maxLength = currLength;
                }
            }

            // Make entry for this sum value in hash
            // table if this value is not present.
            if (!map.containsKey(sum))
                map.put(sum, i);
        }
        System.out.println(maxLength);
//        for (int i=0; i<size; i++) {
//            arr[i] = Integer.parseInt(Character.toString(strArr.charAt(i)));
//        }
//
//        int per_count = 0;
//        int temp_count = 0;
//
//        for (int i=0; i<size; i++) {
//            if (arr[i] == 0)
//                temp_count++;
//            else if (temp_count > per_count) {
//                per_count = temp_count;
//                temp_count = 0;
//            }
//        }
//        if (temp_count > per_count) {
//            per_count = temp_count;
//        }
//        System.out.println(++per_count);

    }
}
