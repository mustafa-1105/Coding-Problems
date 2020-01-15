import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 05-Jan-17.
 */
public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int num=0;
        for (int i=0;i<nums.length;i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            } else {
                num = nums[i];
                list.remove(new Integer(nums[i]));
                break;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,4};
        int num = new FindDuplicateNumber().findDuplicate(nums);
    }
}
