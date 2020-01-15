/**
 * Created by admin on 03-Jan-17.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] productArrayPrev = new int[nums.length];
        int[] productArrayNext = new int[nums.length];
        int[] finalProduct = new int[nums.length];
        int prev = 1;
        for (int i=1;i<nums.length;i++) {
            productArrayPrev[i-1] = prev;
            prev=prev*nums[i-1];
        }
        productArrayPrev[nums.length-1] = prev;
        int next = 1;
        for (int i=nums.length-2;i>=0;i--) {
            productArrayNext[i+1] =next;
            next=next*nums[i+1];
        }
        productArrayNext[0]=next;
        for (int i=0;i<nums.length;i++) {
            finalProduct[i]=productArrayPrev[i]*productArrayNext[i];
        }
        return finalProduct;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,2,3,3,3};
        int[] productArray = new ProductOfArrayExceptSelf().productExceptSelf(nums);
    }
}
