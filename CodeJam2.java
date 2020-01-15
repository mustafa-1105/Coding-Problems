import java.util.*;

/**
 * Created by mustafa on 13/6/16.
 */

//Problem - Statement -  https://code.google.com/codejam/contest/837485/dashboard

public class CodeJam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cases; i++) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 1) {
                System.out.print("Case #"+(i+1)+": ");
                System.out.println(0);
                sc.nextLine();
            } else {
                String str = sc.nextLine();
                String[] splitstr = str.split(" ");
                List<Integer> blueseg = new ArrayList<Integer>();
                List<Integer> redseg = new ArrayList<Integer>();

                for (int sort=0;sort<n;sort++) {
                    if (splitstr[sort].charAt(splitstr[sort].length()-1) == 'B') {
                        blueseg.add( Integer.parseInt(splitstr[sort].substring(0,splitstr[sort].length()-1)));
                    }
                    else {
                        redseg.add( Integer.parseInt(splitstr[sort].substring(0,splitstr[sort].length()-1))) ;
                    }
                }
                System.out.print("Case #"+(i+1)+": ");

                Collections.sort(blueseg);
                Collections.sort(redseg);
                Collections.reverse(blueseg);
                Collections.reverse(redseg);

                int scan = 0;
                int length = 0;
                while (scan < blueseg.size() && scan < redseg.size()) {

                    length=length + blueseg.get(scan) + redseg.get(scan) - 1;
                    scan++;
                }
                System.out.println(length-scan);
            }
        }
    }
}
