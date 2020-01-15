import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SumOfPowers {
    static boolean IsPowerNum(long n) {
        if (n == 2 )
            return true;

        HashSet<Long> hashSet = new HashSet<Long>();
        hashSet.add(0L);
        hashSet.add(1L);

        int f = 0;
        for (int x = 2; x <= Math.sqrt(n); x++) {

            int lgx = (int) Math.ceil((Math.log(n) / Math.log(x)));
            if (f == 1)
                break;

            for (int y = 2; y <= lgx; y++) {
                long num = (long) Math.pow(x, y);
                if (hashSet.contains(n - num) || num+num==n) {
                    f = 1;
                    break;
                }
                hashSet.add(num);
            }
        }
        if (f == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        int count = 0;

        for (long i=l; i<=r; i++) {
            if (IsPowerNum(i))
                count++;
        }
        System.out.println(count);
    }
}
