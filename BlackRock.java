import java.util.Scanner;

/**
 * Created by mustafa on 11/6/16.
 */

//Problem - Statement - https://www.hackerrank.com/contests/blackrock-codesprint/challenges/currency-arbitrage
public class BlackRock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int cases=0;
        String str;

        Scanner sc = new Scanner(System.in);
        cases = Integer.parseInt(sc.nextLine());

        for(int i=0;i<cases;i++) {
            str=sc.nextLine();
            String[] vals = str.split(" ",3);

            Double temp = 100000/Double.parseDouble(vals[0]);
            Double temp1 = temp/Double.parseDouble(vals[1]);
            Double temp2 = temp1/Double.parseDouble(vals[2]);
            if(temp2>100000){
                int ans = (temp2.intValue()-100000);
                System.out.println(ans);
            }
            else
                System.out.println(0);
        }
    }
}
