// Problem Statement - https://www.hackerearth.com/goodbox-internship-challenge/problems/db45ca945ab5462795b01ff4a16bf4e8/
import java.util.Scanner;

/**
 * Created by admin on 20-Nov-16.
 */
public class NightMareProblem {

    public Boolean isPrime(int num) {
        for (int i=2;i<=num/2;i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int num=0;
        sc.nextLine();
        NightMareProblem obj = new NightMareProblem();
        for (int j=0;j<cases;j++) {

            int i = 2;
            num = sc.nextInt();
            int temp_num = num;
            int countFactors=0;
            int countpairs = 0;
            while (temp_num > 1) {
                if (temp_num % i == 0) {
                    countFactors++;
                    temp_num = temp_num / i;
                } else
                    i++;
            }
            if (countFactors ==  3) {
                System.out.println(-1);
            }
            else {
                if (!obj.isPrime(num))
                countpairs++;
                for (int a=4;a<num/4;a++) {
                    for (int b=num/4;b>a;b--) {
                        if (a*b == num) {
                            if (!obj.isPrime(a)) {
                                if (!obj.isPrime(b)) {
                                    countpairs++;

                                }
                            }
                        }
                    }
                }
                System.out.println(countpairs);
            }
        }
    }
}
