import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 13-Nov-16.
 */
public class MinMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[5];
        for (int i=0;i<5;i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long min,max;
        min = arr[0]+arr[1]+arr[2]+arr[3];
        max = arr[4]+arr[1]+arr[2]+arr[3];
        System.out.println(min+" "+max);
    }
}
