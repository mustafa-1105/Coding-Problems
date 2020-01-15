import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by admin on 20-May-18.
 */
public class DetermineTheWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int intial[] = new int[4];
        int decr[] = new int[4];
        int flashTime[] = new int[4];
        int ciscoTime[] = new int[4];

        int fScore = 0;
        int fTotalTime = 0;
        int cScore = 0;
        int cTotalTime = 0;

        for (int i=0; i< testcases; i++) {
            fScore = 0;
            fTotalTime = 0;
            cScore = 0;
            cTotalTime = 0;

            int fs1, fs2, fs3, fs4 = 0;
            int cs1, cs2, cs3, cs4 = 0;

            sc.nextLine();
            intial[0] = sc.nextInt();
            intial[1] = sc.nextInt();
            intial[2] = sc.nextInt();
            intial[3] = sc.nextInt();

            sc.nextLine();
            decr[0] = sc.nextInt();
            decr[1] = sc.nextInt();
            decr[2] = sc.nextInt();
            decr[3] = sc.nextInt();

            sc.nextLine();
            flashTime[0] = sc.nextInt();
            flashTime[1] = sc.nextInt();
            flashTime[2] = sc.nextInt();
            flashTime[3] = sc.nextInt();

            sc.nextLine();
            ciscoTime[0] = sc.nextInt();
            ciscoTime[1] = sc.nextInt();
            ciscoTime[2] = sc.nextInt();
            ciscoTime[3] = sc.nextInt();

            fs1 = (intial[0] - (flashTime[0] * decr[0]));
            if (fs1 < intial[0]/2) {
                fs1 = intial[0] / 2;
            }
            fs2 = (intial[1] - (flashTime[1] * decr[1]));
            if (fs2 < intial[1]/2) {
                fs2 = intial[1] / 2;
            }
            fs3 = (intial[2] - (flashTime[2] * decr[2]));
            if (fs3 < intial[2]/2) {
                fs3 = intial[2] / 2;
            }
            fs4 =  (intial[3] - (flashTime[3] * decr[3]));
            if (fs4 < intial[3]/2) {
                fs4 = intial[3] / 2;
            }
            System.out.println(fs1+", " + fs2 + ", "+fs3+", "+fs4);
            fScore =  fs1 + fs2 + fs3 + fs4;

            cs1 = (intial[0] - (ciscoTime[0] * decr[0]));
            if (cs1 < intial[0]/2) {
                cs1 = intial[0] / 2;
            }
            cs2 = (intial[1] - (ciscoTime[1] * decr[1]));
            if (cs2 < intial[1]/2) {
                cs2 = intial[1] / 2;
            }
            cs3 = (intial[2] - (ciscoTime[2] * decr[2]));
            if (cs3 < intial[2]/2) {
                cs3 = intial[2] / 2;
            }
            cs4 = (intial[3] - (ciscoTime[3] * decr[3]));
            if (cs4 < intial[3]/2) {
                cs4 = intial[3] / 2;
            }

            System.out.println(cs1+", " + cs2 + ", "+cs3+", "+cs4);
            cScore =  cs1 + cs2 + cs3 + cs4;

            if (fScore == cScore) {
                Arrays.sort(flashTime);
                fTotalTime = flashTime[3];

                Arrays.sort(ciscoTime);
                cTotalTime = ciscoTime[3];

                if (fTotalTime == cTotalTime) {
                    System.out.println("Tie");
                } else if (fTotalTime < cTotalTime) {
                    System.out.println("Flash");
                } else {
                    System.out.println("Cisco");
                }
            } else if (fScore > cScore) {
                System.out.println("Flash");
            } else {
                System.out.println("Cisco");
            }
        }
    }
}
