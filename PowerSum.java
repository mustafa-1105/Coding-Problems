// Java program to find number of ways to expresults a
// number as sum of n-th powers of numbers.
import java.io.*;
import java.util.*;

public class PowerSum {

    static int result = 0;
    static int checkRecursive(int num, int x, int k, int n) {
        if (x == 0)
            result++;

        int r = (int)Math.floor(Math.pow(num, 1.0 / n));

        for (int i = k + 1; i <= r; i++) {
            int a = x - (int)Math.pow(i, n);
            if (a >= 0)
                checkRecursive(num,
                        x - (int)Math.pow(i, n), i, n);
        }
        return result;
    }

    static int check(int x, int n) {
        return checkRecursive(x, x, 0, n);
    }

    public static void main(String[] args) {
        System.out.println(check(10, 2));
    }
}
