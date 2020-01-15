import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 23-Feb-19.
 */
public class DuplicateChar {
    public static void main(String[] args) {
        String str = "Geek";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int val = 0;
        char c = '\0';
        for (int i=0; i<str.length(); i++) {
            c = str.charAt(i);
            if (map.containsKey(c)) {
                val = map.get(c) + 1;
                map.replace(c, val);
            }
            else {
                val = 1;
                map.put(c, val);
            }
            System.out.println(c + " : " + val);
        }

        for (Map.Entry<Character, Integer> e: map.entrySet()) {
            if (e.getValue() > 1)
                System.out.println(e.getKey());
        }
    }
}
