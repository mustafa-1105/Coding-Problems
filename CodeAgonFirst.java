import java.util.Scanner;

/**
 * Created by admin on 26-Jan-17.
 */
public class CodeAgonFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long xTreasure = sc.nextLong();
        long yTreasure = sc.nextLong();
        int n = sc.nextInt();
        long[][] direction = new long[n][2];
        for(int direction_i=0; direction_i < n; direction_i++){
            for(int direction_j=0; direction_j < 2; direction_j++){
                direction[direction_i][direction_j] = sc.nextLong();
            }
        }
        long outX = xTreasure,outY = yTreasure;
        for(int direction_i=0; direction_i < n; direction_i++){
                outX = outX - direction[direction_i][0];
                outY = outY - direction[direction_i][1];
        }
        System.out.println(outX+" "+outY);
    }
}
