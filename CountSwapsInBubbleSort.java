import java.util.Arrays;

public class CountSwapsInBubbleSort {

    static void countSwaps(int[] a) {
        int count = 0;
        boolean  doneSwapping = false;

        for (int i=0; i<a.length; i++) {
            for (int j=i; j<a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    count++;
                    doneSwapping = true;
                }
            }
            if (doneSwapping)
                System.out.println(Arrays.toString(a));
            else
                doneSwapping = false;
        }
        System.out.println(count + " : " + a[0] + " : " + a[a.length-1]);
    }

    public static void main(String[] args) {
        int[] a = {5,1,4,2,8};
        countSwaps(a);
    }
}
