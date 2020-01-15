import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 03-Jan-17.
 */
public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicateNums = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int index =Math.abs(nums[i]);
            if(nums[index-1] >0){
                nums[index-1] = - nums[index-1];
            }else{
                duplicateNums.add(Math.abs(nums[i]));
                System.out.println(Math.abs(nums[i]));
            }
        }
        return duplicateNums;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> duplicateNums = new FindAllDuplicates().findDuplicates(nums);
    }
}
