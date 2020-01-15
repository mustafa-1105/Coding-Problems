//Problem Statement - https://www.hackerearth.com/codemonk-arrays-strings/algorithm/monk-and-inversions-arrays-strings/


import java.util.Scanner;

/**
 * Created by admin on 24-Oct-16.
 */
public class MatrixInversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();

        for (int i=0;i<cases;i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int arr[][] = new int[n][n];
            int count = 0;

            for (int p=0;p<n;p++) {
                for (int q=0;q<n;q++) {
                    arr[p][q] = sc.nextInt();
                }
                sc.nextLine();
            }

            for (int l=0;l<n;l++) {
                for (int m=0;m<n;m++) {
                    for (int x=l;x<n;x++){
                        for (int y=m;y<n;y++) {
                            if (arr[l][m] > arr[x][y] && l<=x && m<=y) {
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}

