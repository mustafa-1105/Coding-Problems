import java.util.*;

/**
 * Created by admin on 03-Jun-18.
 */
public class NthPalindromicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i=0; i<cases; i++) {
            int n = sc.nextInt();
            String ns = String.valueOf(n);

            Map<Character, Integer> map = new TreeMap<Character, Integer>();
            for (int j = 0; j < ns.length(); ++j)
            {
                char charAt = ns.charAt(j);

                if (!map.containsKey(charAt))
                {
                    map.put(charAt, 1);
                }
                else
                {
                    map.put(charAt, map.get(charAt) + 1);
                }
            }

            int[] counts = new int[10];
            if (map.containsKey('0')) {
                counts[0] = map.get('0');
            }
            if (map.containsKey('1')) {
                counts[0] = map.get('1');
            }
            if (map.containsKey('2')) {
                counts[0] = map.get('2');
            }
            if (map.containsKey('3')) {
                counts[0] = map.get('3');
            }
            if (map.containsKey('4')) {
                counts[0] = map.get('4');
            }
            if (map.containsKey('5')) {
                counts[0] = map.get('5');
            }
            if (map.containsKey('6')) {
                counts[0] = map.get('6');
            }
            if (map.containsKey('7')) {
                counts[0] = map.get('7');
            }
            if (map.containsKey('8')) {
                counts[0] = map.get('8');
            }
            if (map.containsKey('9')) {
                counts[0] = map.get('9');
            }
            for (int j=0; j<10; j++) {
                System.out.println(counts[j]);
            }
            int ans=0;
            for (int j=0; j<9; j++) {
                if ( counts[j+1] > counts[j] ) {
                    ans = j+1;
                }
            }
            System.out.println(ans);
        }
    }
}
