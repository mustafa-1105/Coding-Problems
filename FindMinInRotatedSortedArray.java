import java.util.Arrays;

/**
 * Created by admin on 05-Jan-17.
 */
public class FindMinInRotatedSortedArray {
    public int findMin(int[] nums) {
        int min=0;
        Arrays.sort(nums);
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,3};
        int min = new FindMinInRotatedSortedArray().findMin(nums);
    }
}
