//Problem Statement - https://www.hackerearth.com/codemonk-arrays-strings/algorithm/monk-and-rotation-3/

import java.util.Scanner;

/**
 * Created by admin on 24-Oct-16.
 */
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < cases; x++) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            int arr[] = new int[n];

            for (int p = 0; p < n; p++) {
                arr[p] = sc.nextInt();
            }

            int offset = arr.length - k % arr.length;
            if (offset > 0) {
                int[] copy = arr.clone();
                for (int i = 0; i < arr.length; ++i) {
                    int j = (i + offset) % arr.length;
                    arr[i] = copy[j];
                }
            }

            for (int p = 0; p < n; p++) {
                System.out.print(arr[p] + " ");
            }
        }
    }
}
