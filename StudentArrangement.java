import java.util.Scanner;

/**
 * Created by admin on 05-Feb-17.
 */
public class StudentArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int preferredRow[] = new int[5];

        for (int i=0;i<n;i++) {
            preferredRow[i] = sc.nextInt();
        }
        int notPreferred = 0;
        int row;
        int arr[] = new int[m];
        for (int i=0;i<n;i++) {
            row = preferredRow[i]-1;
            if (arr[row] < k) {
                arr[row]++;
            } else if (row < m && arr[row+1] < k){
                arr[row+1]++;
                notPreferred++;
            } else {
                notPreferred++;
            }
        }
        System.out.println(notPreferred);
    }
}
