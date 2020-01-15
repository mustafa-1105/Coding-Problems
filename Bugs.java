

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by admin on 20-May-18.
 */
public class Bugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int task = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0;i<n;i++) {
            task = sc.nextInt();
            if (task == 1) {
                int p = sc.nextInt();
                arrayList.add(p);
                sc.nextLine();
            } else if (task == 2) {
                if (arrayList.size() < 3) {
                    System.out.println("Not enough enemies");
                } else {
                    Collections.sort(arrayList, Collections.reverseOrder());
                    int ansPos = arrayList.size()/3;
                    System.out.println(arrayList.get(ansPos-1));
                }
                sc.nextLine();

            }
        }
    }
}
