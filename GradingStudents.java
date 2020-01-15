import java.util.Scanner;

/**
 * Created by admin on 28-Jan-17.
 */
public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++) {
            int grade = sc.nextInt();
            if (grade >= 38) {
                if (grade%5 >= 3) {
                    grade = grade + (5- (grade%5));
                }
            }
            System.out.println(grade);
        }
    }
}
