import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by admin on 06-Nov-16.
 */
public class MagicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        int n,l,r,num;
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                arr.add(i);
            }
        }
        for (int k=0;k<cases;k++) {
            n = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();

            int total=0;
            for (int j=l;j<=r;j++) {
                for (int m=0;m<arr.size() && arr.get(m) <= n ;m++) {
                    if (j%arr.get(m) == 0) {
                        total++;
                        break;
                    }
                }
            }
            System.out.println(total);
        }
    }
}
