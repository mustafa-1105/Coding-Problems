import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by admin on 24-Feb-19.
 */
public class PrintRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, m;
        n = sc.nextInt();
        k = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<String>();

        int count = k;
        for (int i=0; i<n; i++) {
            list.add(sc.nextLine());
        }
        for (int i=k*(m-1); i<k*m && i<n; i++){
            System.out.println(list.get(i));
        }
    }
}
