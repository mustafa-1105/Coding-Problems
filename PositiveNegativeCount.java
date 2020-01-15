import java.util.Scanner;

/**
 * Created by admin on 20-Jan-17.
 */
public class PositiveNegativeCount {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0;i<cases;i++) {
            int num = sc.nextInt();
            sc.nextLine();
            int positive = 0;
            int negative = 0;
            while (num>0) {
                int n = sc.nextInt();
                if (n<0) {
                    negative++;
                }
                else {
                    positive++;
                }
                num--;
            }
            System.out.println(positive+" "+negative);
        }
    }
}
