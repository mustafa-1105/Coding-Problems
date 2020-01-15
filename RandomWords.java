import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 04-Feb-17.
 */
public class RandomWords {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // TODO: Argument validation (nullity, length)
                return s1.length() - s2.length();// comparision
            }
        });
        for (int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}
