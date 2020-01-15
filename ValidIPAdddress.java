import java.util.Scanner;

/**
 * Created by admin on 05-Mar-17.
 */
public class ValidIPAdddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int flag = 0;
        String[] arr = ip.split("[.]");
        for (int i=0;i<4;i++) {
            if (arr[i].matches("[a-zA-Z]")) {
                flag=1;
                break;
            }else {
                int num = Integer.parseInt(arr[i]);
                if (num < 0 || num > 255) {
                    flag=1;
                    break;
                } else {
                    flag = 0;
                }
            }
        }
        if (flag == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
