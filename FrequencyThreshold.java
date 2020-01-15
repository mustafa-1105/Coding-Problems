import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by admin on 24-Feb-19.
 */
public class FrequencyThreshold {

    static int SumKeys(HashMap<Integer, Integer> map, int t) {
        int sum = 0;

        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getValue() >= t)
                sum += e.getKey();
        }
        return sum;
    }

    public static void main(String[] args) {
        int q, t;
        Scanner sc = new Scanner(System.in);
        q = sc.nextInt();
        t = sc.nextInt();

        sc.nextLine();
        String str;
        int opr;
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
        int num;
        for (int i=0; i<q; i++) {
            str = sc.nextLine();
            num = Integer.parseInt(String.valueOf(str.charAt(2)));
            if (str.charAt(0) == 'i') {
                if (nums.containsKey(num))
                    nums.put(num, nums.get(num)+1);
                else
                    nums.put(num, 1);
                System.out.println(SumKeys(nums, t));
            } else if (str.charAt(0) == 'd') {
                if (nums.containsKey(num))
                    nums.put(num, nums.get(num)-1);
            }
        }
    }
}
