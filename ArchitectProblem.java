import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by admin on 19-Nov-17.
 */
public class ArchitectProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int extraWork = in.nextInt();
        in.nextLine();

        int [] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int Max = arr[N-1];
        int count=1;
        int i=N-2;
//        for (int i=N-2;i>=0;i--) {
//
//        }
        while (i>=0) {
            int workAdded = Max-arr[i];
            extraWork -= workAdded;
            if (extraWork >= 0){
                count++;
                //System.out.println(count);
            }
            i--;
        }
        System.out.print(count);
    }
}
