import java.util.*;

/**
 * Created by admin on 01-Mar-19.
 */
public class FrequencySort {

    public static void customSort(List<Integer> arr) {
        Collections.sort(arr);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int key, value=1;
        for (int i=0; i<arr.size(); i++) {
            key = arr.get(i);
            value=1;
            if (map.containsKey(key)) {
                value = map.get(key);
                map.replace(key, value, ++value);
            } else {
                map.put(key, value);
            }
        }


    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);

        customSort(arr);
    }
}
