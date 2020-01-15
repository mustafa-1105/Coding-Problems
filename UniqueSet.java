import java.util.*;

/**
 * Created by mustafa on 8/6/16.
 */
public class UniqueSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        String str;
        double len,br,ht;

        Set<Box> b = new HashSet<Box>();

        for (int i=0;i<cases;i++) {

            str=sc.nextLine();
            String[] vals = str.split(",",3);

            len = Double.parseDouble(vals[0]);
            br = Double.parseDouble(vals[1]);
            ht = Double.parseDouble(vals[2]);

            b.add(new Box(len,br,ht));
            System.out.println(b);

        }

        System.out.println("Unique Sets are : " +b.size());

    }

    private static class Box {

        public double l, w, h;

        public Box(double l, double w, double h) {
            this.l = l;
            this.h = h;
            this.w = w;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Box box = (Box) o;

            if (Double.compare(box.l, l) != 0) return false;
            if (Double.compare(box.w, w) != 0) return false;
            return Double.compare(box.h, h) == 0;

        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            temp = Double.doubleToLongBits(l);
            result = (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(w);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(h);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }
}
