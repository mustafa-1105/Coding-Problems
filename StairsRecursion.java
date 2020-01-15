/**
 * Created by admin on 06-Jan-17.
 */
public class StairsRecursion {
    int ways(int n) {
        if (n==2 || n==1 || n==0) {
            return n;
        }
        else
            return ways(n-1) + ways(n-2);
    }

    public static void main(String[] args) {
        int ways = new StairsRecursion().ways(5);
        System.out.println(ways);
    }
}
