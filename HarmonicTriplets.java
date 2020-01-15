import java.util.Scanner;

/**
 * Created by admin on 19-Nov-17.
 */
public class HarmonicTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        for (int i=0;i<TestCases;i++) {
            int N = sc.nextInt();
            int NumOfQ = sc.nextInt();
            int []arr = new int[N];
            for (int j=0;j<N;j++) {
                arr[j] = sc.nextInt();
            }
            for (int k=0;k<NumOfQ;k++) {
                int index = sc.nextInt();
                index--;
                int left, right;
                left = 0;
                right = 0;
                for (int rightSide = index+1;rightSide<N;rightSide++){
                    if (arr[rightSide] <= arr[index] && arr[rightSide] >= right) {
                        right=arr[rightSide];
                    }
                }
                for (int leftSide = 0;leftSide<index;leftSide++) {
                    if (arr[leftSide] <= arr[index] && arr[leftSide] >= left) {
                        left=arr[leftSide];
                    }
                }
                System.out.println(left*arr[index]*right);
            }
        }
    }
}
