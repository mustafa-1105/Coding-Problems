import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by mustafa on 20/6/16.
 */
public class WordCodeSprint_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int a[] = new int[n];

        ArrayList<Integer> diff = new ArrayList<Integer>();
        int scan = 0;
        for (int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++) {
            scan = i+1;
            while (scan < n) {
                if (a[i] == a[scan]) {
                    diff.add(Math.abs(i-scan));
                    break;
                }
                else
                    scan++;
            }
        }
        if (diff.size() > 0) {
            Collections.sort(diff);
            System.out.println(diff.get(0));
        }
        else
            System.out.println("-1");
    }
}
