import java.util.*;

public class FindingTheSum {

    public static int LengthOfSubArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int minLen = n+1;

        // Initialize current sum and minimum length
        int curr_sum = 0;

        // Initialize starting and ending indexes
        int start = 0, end = 0;

        while (end < n) {
            // Keep adding array elements while current sum is smaller than k
            while (curr_sum <= k && end < n)
                curr_sum += arr.get(end++);

            // If current sum becomes greater than k.
            while (curr_sum >= k && start < n)
            {
                // Update minimum length if needed
                if (end - start < minLen)
                    minLen = end - start;

                // remove starting elements
                curr_sum -= arr.get(start++);
            }
        }
        return minLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i<n; i++)
            arr.add(sc.nextInt());

        ArrayList<Integer> orig = (ArrayList<Integer>) ((ArrayList<Integer>) arr).clone();
        ArrayList<Integer> rev = (ArrayList<Integer>) ((ArrayList<Integer>) arr).clone();
        Collections.reverse(rev);

        int minLen = -1;
        int itr = 1;

        while(true) {
            minLen = LengthOfSubArray(arr, k);
            if (minLen != arr.size()+1)
                break;

            itr++;

            if(itr%2 == 0)
                arr.addAll(rev);
            else
                arr.addAll(orig);
        }
        System.out.println(minLen-1);
    }
}
