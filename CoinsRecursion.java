/**
 * Created by admin on 06-Jan-17.
 */
public class CoinsRecursion {
     static  int coins(int amount) {
        if(amount==7 || amount==11) {
            return 1;
        }
        if (amount>7) {
            int x = coins(amount - 11);
            int y = coins(amount - 7);
            if (x < y)
                return x+1;
            else
                return y+1;
        }
        else
            return -1;
        }

    public static void main(String[] args) {
        int coins = new CoinsRecursion().coins(22);
        System.out.println(coins);
    }
}
