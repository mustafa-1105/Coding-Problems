import java.util.Scanner;

/**
 * Created by admin on 02-Sep-16.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,m=0,flag=0;
        int n=sc.nextInt();//it is the number to be checked
        m=n/2;
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("Number is not prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Number is prime");
    }
}
