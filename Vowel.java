import java.util.Scanner;

/**
 * Created by admin on 02-Sep-16.
 */
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chr = sc.nextLine();
        char chr1 = chr.charAt(0);
        int chr2 = (int) chr1;
        if (chr1 == 'a' || chr1 =='A' || chr1 =='e' || chr1 =='E' || chr1 =='i' || chr1 =='I' || chr1 =='o' || chr1 =='O' || chr1 =='u' || chr1 =='U') {
            System.out.println(chr1 + " is a vowel.");
        } else if ((chr2 > 64 && chr2 <91) || (chr2 > 96 && chr2 < 123)) {
            System.out.println(chr1 + " is a consonant.");
        }
    }
}
