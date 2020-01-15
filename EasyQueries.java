import java.util.Scanner;

/**
 * Created by admin on 25-Aug-18.
 */
public class EasyQueries {

    public int returnLeftIndex(int[] array, int currIndex) {
        int leftIndex = -1;
        if (currIndex == 0) {
            return leftIndex;
        }

        for (int i = currIndex-1; i>=0; i--) {
            if (array[i] == 1) {
                leftIndex = i;
                break;
            }
        }
        return leftIndex;
    }

    public int returnRightIndex(int[] array, int currIndex) {
        int rightIndex = -1;

        if (currIndex == array.length-1) {
            return rightIndex;
        }

        for (int i=currIndex+1; i<array.length; i++) {
            if (array[i] == 1) {
                rightIndex = i;
                break;
            }
        }
        return rightIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EasyQueries easyQueries = new EasyQueries();
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int query, index;
        int LIndex = -1;
        int RIndex = -1;

        for (int i=0; i<q; i++) {
            query = sc.nextInt();
            index = sc.nextInt();

            if (query == 0) {
                LIndex = easyQueries.returnLeftIndex(arr, index);
                RIndex = easyQueries.returnRightIndex(arr, index);
                System.out.println(LIndex + " " + RIndex);
            } else if (query == 1) {
                arr[index] = 1;
            }

        }
    }
}
