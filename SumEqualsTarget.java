/**
 * Created by admin on 03-Jan-17.
 */
public class SumEqualsTarget {
    public int[] twoSum(int[] numbers, int target) {
        int[] ansIndexs = new int[2];
        int low = 0;
        int high = numbers.length-1;
        while (numbers[low] + numbers[high] != target) {
            if (numbers[low] + numbers[high] > target) {
                high--;
            } else {
                low++;
            }
        }
        ansIndexs[0]=low+1;
        ansIndexs[1]=high+1;
        System.out.println(ansIndexs[0]+" : "+ansIndexs[1]);
        return ansIndexs;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;
        int[] ansIndexs = new SumEqualsTarget().twoSum(nums,target);
    }
}
