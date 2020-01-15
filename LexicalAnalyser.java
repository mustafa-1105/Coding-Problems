import java.util.Scanner;

/**
 * Created by admin on 18-Feb-17.
 */
public class LexicalAnalyser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines =  sc.nextInt();
        sc.nextLine();
        int count=0;
        for (int i=0;i<lines;i++) {
            String str = sc.nextLine();
            str = str.replaceAll(">=" , "a");
            str = str.replaceAll("<=" , "b");
            str = str.replaceAll("==" , "c");
//            System.out.println(str);
            for (int j=0;j<str.length();j++) {
                if (str.charAt(j) == '=') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
