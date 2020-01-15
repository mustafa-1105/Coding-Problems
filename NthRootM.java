import java.util.Scanner;

/**
 * Created by admin on 12-Feb-17.
 */
public class NthRootM {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        int n=0,m=0;
        double result=0.0;
        for (int i=0;i<cases;i++){
            n = sc.nextInt();
            m = sc.nextInt();
            sc.nextLine();
            result = Math.pow(m,1.0/n);
            if (result%1 == 0) {
                System.out.println(result);
            } else {
                System.out.println("-1");
            }
        }
    }
}
