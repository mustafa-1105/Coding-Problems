import java.util.Scanner;

/**
 * Created by admin on 27-Sep-17.
 */
public class CutShort {

        public static long solveProblem(int x) {
		/*

		Write solution code here

		*/
		    int a,b, sum;
		    a=0; b=1;

            sum=0;

            for (int i = 1; a <= x; ++i)
            {
                System.out.print(a + " + ");

                sum = a + b;
                a = b;
                b = sum;
            }

            return sum-1;
        }

//Sample code only. Feel free to change to accept the input described in the problem.

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner in = new Scanner(System.in);
		/*Parse input here*/

            int x = in.nextInt();
            long result = solveProblem(x);
            //System.out.println(result);
        }
}
