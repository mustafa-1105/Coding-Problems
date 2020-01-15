import java.util.Scanner;

/**
 * Created by admin on 31-Dec-16.
 */
public class ArithmaticSequenceCount {
    public int numberOfArithmeticSlices(int[] A) {
        int count=0;
        int sequence = 0;
        int diff = A[1]-A[0];
        for (int i=1;i<A.length-1;i++) {
            if (diff == A[i+1] - A[i]) {
                sequence++;
                count = count+sequence;
            }
            else {
                diff = A[i+1] - A[i];
                sequence=0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,8,9,10};
        int count = new ArithmaticSequenceCount().numberOfArithmeticSlices(A);
        System.out.println(count);
    }
}