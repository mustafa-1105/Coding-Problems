/**
 * Created by admin on 13-Nov-18.
 */
public class RemovedEvenDuplicate {
    public static String abc;

    public static void temp() {
        abc = "345";
    }
    public static void main(String[] args) {
        abc = "1234";
        temp();
        System.out.println(abc);
    }
}
