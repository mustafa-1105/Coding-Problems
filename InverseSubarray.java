import java.util.Scanner;

/**
 * Created by admin on 18-Feb-17.
 */
public class InverseSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<cases;i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int arr[] = new int[n];
            for (int j=0;j<n;j++) {
                arr[j] = sc.nextInt();
            }
            int temp=0,subLength=0;
            for (int p=0;p<arr.length;p++) {
                for (int q=arr.length-1;q>p;q--) {
                    if (arr[p] >= arr[q]) {
                        temp = q-p+1;
                        if (temp>subLength) {
                            subLength = temp;
                        }
                    }
                }
            }
            System.out.println(subLength);
        }
    }
}


