import java.util.Scanner;

/**
 * Created by admin on 20-Jan-17.
 */
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0;i<cases;i++) {
            sc.nextLine();
            int count=1;
            String str = sc.nextLine();
            for (int j=0;j<str.length()-1;j++) {
                if (str.charAt(j) == ' ' && str.charAt(j+1) != ' ') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
