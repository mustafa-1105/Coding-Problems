import com.sun.xml.internal.bind.v2.runtime.output.C14nXmlOutput;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 25-Aug-18.
 */
public class BestIndex {

    public int getSumOfNIntegers(int[] array, int fromIndex, int n) {
        int sum = 0;
        if (fromIndex+n >= array.length)
            return sum;

        System.out.println("From index: " + fromIndex + "  n: " + n);

        while (n>0) {
            sum += array[fromIndex];
            fromIndex++;
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BestIndex bestIndex = new BestIndex();

        int n = sc.nextInt();
        int[] arr= new int[n];
        int[] sumArray = new int[n];

        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            int count = i;
            while (count<=n) {
                sumArray[i] += bestIndex.getSumOfNIntegers(arr, count, ++count);
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
