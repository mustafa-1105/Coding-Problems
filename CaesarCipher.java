import java.util.Scanner;

/**
 * Created by admin on 05-Mar-17.
 */
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases;
        cases = sc.nextInt();
        sc.nextLine();
        String original,cipher;
        int diff1=0,diff2=0;
        int flag =0;

        for (int i=0;i<cases;i++) {
            original = sc.nextLine();
            cipher = sc.nextLine();
            for (int j=0;j<original.length()-1;j++) {
                diff1 = cipher.charAt(j) - original.charAt(j);
                diff2 = cipher.charAt(j+1) - original.charAt(j+1);
                if (diff1 < 0) {
                    diff1 = 26 + diff1;
                }
                if (diff2 < 0) {
                    diff2 = 26 + diff2;
                }
                if (diff1 == diff2) {
                    flag=0;
                } else {
                    flag =1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(diff1);
            } else {
                System.out.println("-1");
            }
        }
    }
}
