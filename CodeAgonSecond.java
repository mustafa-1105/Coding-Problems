import java.util.Scanner;

/**
 * Created by admin on 26-Jan-17.
 */
public class CodeAgonSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] crate = new int[c][2];
        for(int crate_i=0; crate_i < c; crate_i++){
            for(int crate_j=0; crate_j < 2; crate_j++){
                crate[crate_i][crate_j] = sc.nextInt();
            }
        }

        int max=0,usedN=0;
        int minusN=0;
        int minusI = 0;
        int temp = 0;
        int totalSticks = 0;
        while (n>0) {
            max=0;
            for (int i=0;i<c;i++) {
                if (crate[i][0] >= n) {
                    temp = crate[i][1] * n;
                    usedN = n;
                }
                else {
                    temp = crate[i][1] * crate[i][0];
                    usedN = crate[i][0];
                }
                if (temp > max) {
                    max = temp;
                    minusN = usedN;
                    minusI = i;
                }
            }
            totalSticks = totalSticks+max;
            crate[minusI][0] -=minusN;
            n -= minusN;
        }
        System.out.println(totalSticks);
    }
}
