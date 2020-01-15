

import java.util.*;

/**
 * Created by admin on 02-Jan-17.
 */
public class SortCharsByFrequency {
    public String frequencySort(String s) {
        StringBuilder str = new StringBuilder();
        HashMap<Character,Integer> store = new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            Integer count = store.get(c);
            if (count == null) {
                count = 0;
            }
            store.put(c, ++count);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(store.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
            int tempCount=0;
            char tempchar=' ';
            for (Map.Entry<Character,Integer> entry : list) {
                tempCount=entry.getValue();
                tempchar=entry.getKey();
                while (tempCount>0) {
                    str.append(tempchar);
                    tempCount--;
                }
            }
            String str1 = str.toString();
        return str1;
    }
    public static void main(String[] args) {
        String str = "tree";
        str = new SortCharsByFrequency().frequencySort(str);
        System.out.println(str);
    }
}
