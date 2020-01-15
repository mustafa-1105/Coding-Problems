import java.util.Scanner;

/**
 * Created by admin on 25-Jun-16.
 */
public class WordCodeSprint_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int h1[] = new int[n1];
        int h2[] = new int[n2];
        int h3[] = new int[n3];

        int s1=0,s2=0,s3=0;
        sc.nextLine();
        for (int i=0;i<n1;i++) {
            h1[i] = sc.nextInt();
            s1=s1+h1[i];
        }

        sc.nextLine();
        for (int i=0;i<n2;i++) {
            h2[i] = sc.nextInt();
            s2=s2+h2[i];
        }

        sc.nextLine();
        for (int i=0;i<n3;i++) {
            h3[i] = sc.nextInt();
            s3=s3+h3[i];
        }
        int high = 0;
        if (s1>s2) {
            high = s1;
        }
        else
            high = s2;
        if (high<s3) {
            high = s3;
        }
    }
}
