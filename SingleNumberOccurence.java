import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 02-Jan-17.
 */
public class SingleNumberOccurence {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] ansNums = new int[2];
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<nums.length;i++){
            if (!list.contains(nums[i])){
                list.add(nums[i]);
            }
            else list.remove(new Integer(nums[i]));
        }
        ansNums[0] = list.get(0);
        ansNums[1] = list.get(1);
        return ansNums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ansNums = new SingleNumberOccurence().singleNumber(nums);
    }
}
