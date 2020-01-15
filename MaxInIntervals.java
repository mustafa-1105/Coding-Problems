import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 24-Feb-19.
 */
public class MaxInIntervals {
    static int findMax(int[] a, int start, int end) {
        int max = Integer.MIN_VALUE; // initialize to minimum Integer

        for(int i=start; i < end; i++)
            if ( a[i] > max )
                max = a[i];

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,l;

        n = sc.nextInt();
        l = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        int[] copyArr = new int[l];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.nextLine();
        for (int i=0; i<n-l+1; i++){
//            System.arraycopy(arr, i, copyArr, 0, l);
//            Arrays.sort(copyArr);

            System.out.println(findMax(arr, i, i+l));
        }
    }
}
