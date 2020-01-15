import java.util.*;

/**
 * Created by mustafa on 10/6/16.
 */

import java.util.Map.Entry;
public class ShowKOrders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        int key,val=0;
        HashMap<Integer,Integer> order = new HashMap<Integer, Integer>();

        for (int i=0;i<cases;i++) {
            key = Integer.parseInt(sc.nextLine());
            if (order.containsKey(key)) {
                val = order.get(key);
                val = val + 1;
                order.put(key,val);
            }
            else {
                order.put(key,1);
            }
        }

        int mapSize = order.size();
        int j=0;
        CheckOrder array[] = new CheckOrder[mapSize];

//        List<CheckOrder> arr = new ArrayList<CheckOrder>();

        Iterator<Integer> i = order.keySet().iterator();

        while(i.hasNext()){
            Integer setKey = i.next();
            System.out.println("key: " + setKey + " value: " + order.get(setKey));
//            arr.add(new CheckOrder(setKey,val));
            array[j] = new CheckOrder(setKey,order.get(setKey));
            j++;
        }

        Arrays.sort(array);

        for (CheckOrder c: array) {
            System.out.println(c);
        }
    }

    private static class CheckOrder implements Comparable<CheckOrder> {
        int setKey,val;
        public CheckOrder(int setKey, int val) {
            this.setKey=setKey;
            this.val=val;
        }

        public int getVal() {
            return val;
        }

        public int getSetKey() {
            return setKey;
        }

        @Override
        public int compareTo(CheckOrder obj) {
            if (this.val == obj.val) {
                return new Integer(setKey).compareTo(new Integer(obj.setKey));
            }
            else {
                return new Integer(obj.val).compareTo(this.val);
            }
        }

        public String toString() {
            return setKey + "=>" + val;
        }
    }
}
