import java.util.Scanner;

/**
 * Created by mustafa on 11/6/16.
 */

//Problem - Statement -  https://www.hackerrank.com/contests/blackrock-codesprint/challenges/suggest-better-spending-rates
public class BlackRock3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc =new Scanner(System.in);
        String str1 = sc.nextLine();

        String[] splitstr = str1.split(" ",4);

        int p = Integer.parseInt(splitstr[0]);
        Double r = Double.parseDouble(splitstr[1])/100;
        int t = Integer.parseInt(splitstr[2]);
        int threshold = Integer.parseInt(splitstr[3]);

        String str2 = sc.nextLine();
        String[] splitstr2 = str2.split(" ",t);

        int[] spend = new int[t];

        Double[] income = new Double[t];
        Double total=0.0;

        int temp=1;
        int i;

        for(i=0;i<t;i++) {
            spend[i] = Integer.parseInt(splitstr2[i]);
        }

        for (i=0;i<t;i++) {

            int j=0;
            temp=1;

            while (j<=i-1) {
                temp = temp * (100-spend[j]);
                j++;
            }

            income[i] = (p*spend[i]*temp*Math.pow((1+r),i+1))/Math.pow(100,i+1);
            total = total + income[i];
        }

        System.out.printf("%.3f",total);
    }
}
