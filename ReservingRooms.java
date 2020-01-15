import java.util.Scanner;

public class ReservingRooms {

    static boolean roomVacant(int[] a, int rS, int rE) {
        boolean result = true;
        while (rS<=rE) {
            if (a[rS-1] == 0 && a[rE-1] == 0) {
                rS++;
                rE--;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        int n,m,q;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        int rangeStart, rangeEnd;

        for (int i=0; i<m; i++) {
            rangeStart = sc.nextInt();
            rangeEnd = sc.nextInt();
            for (int j=rangeStart-1; j<rangeEnd; j++)
                arr[j] = 1;
        }

        q = sc.nextInt();

        for (int i=0; i<q; i++) {
            rangeStart = sc.nextInt();
            rangeEnd = sc.nextInt();

            if (roomVacant(arr, rangeStart, rangeEnd)) {
                for (int j=rangeStart-1; j<rangeEnd; j++)
                    arr[j] = 1;

                System.out.println("OK");

            } else
                System.out.println("NG");
        }
    }
}
