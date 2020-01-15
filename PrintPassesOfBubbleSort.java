import java.util.Scanner;

public class PrintPassesOfBubbleSort {
    static void printArr(int[] a) {
        for (int i=0; i< a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arrS = s.split(" ");
        int[] a = new int[arrS.length];

        for (int i=0; i<arrS.length; i++) {
            a[i] = Integer.parseInt(arrS[i]);
        }

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printArr(a);
        }
    }
}
