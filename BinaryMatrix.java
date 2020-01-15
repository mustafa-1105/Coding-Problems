import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by admin on 22-Jul-18.
 */
public class BinaryMatrix {

    static int countOccurrences(long arr[], int n, long x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
                res++;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        String str[] = new String[n];
        long arr[] = new long[n];
        int minpos, maxpos;

        sc.nextLine();
        for (int i=0; i<n; i++) {
            //arr[i] = Double.longBitsToDouble(new BigInteger(sc.nextLine(), 2).longValue());
            arr[i] = Long.parseLong(sc.nextLine(),2);
            //arr[i] = Integer.parseInt(sc.nextLine(), 2);
        }

        minpos = 0;
        maxpos = 0;

        long smallest = arr[0];
        long biggest = arr[0];

        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] > biggest){
                biggest = arr[i];
                maxpos = i;
            }
            else if (arr[i] < smallest) {
                smallest = arr[i];
                minpos = i;
            }
        }

        int count = countOccurrences(arr, n, biggest);
        if (count == 1) {
            System.out.println(maxpos+1);
        } else {
            System.out.println(minpos+1);
        }
    }
}
