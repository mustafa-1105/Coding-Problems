import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 10-Feb-19.
 */
public class AbsoluteSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        int n=0;
        int[] arr;
        //int max;
        int sum;
        for (int i=0; i<cases; i++) {
            n = sc.nextInt();
            arr = new int[n];
            for (int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            //max = Arrays.stream(arr).max().getAsInt();
            sum = 0;
            int max = 0, max1 = 0;
            for (int k = 0; k<n-1; k++) {
                max1 += Math.abs(arr[k] - arr[k+1]);
                if (max1 > max) {
                    max = max1;
                }
                sum += max1;
            }
            System.out.println("Solution 2: " + (sum-max));
            for (int j=0; j<n-2; j++) {
                if (arr[j] == max) {
                    j++;
                    if (j<n-2) {
                        sum += Math.abs(arr[j] - arr[j+1]);
                        System.out.println("Sum: " + sum + ", j: " + j);
                    }
                } else {
                    sum += Math.abs(arr[j] - arr[j+1]);
                    System.out.println("Sum: " + sum + ", j: " + j);
                }
            }
            System.out.println(sum);
        }
    }
}
