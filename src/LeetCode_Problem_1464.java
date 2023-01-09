import java.util.Arrays;

public class LeetCode_Problem_1464 {
    public static void main(String[] args) {
        int [] arr = {3,7};
        System.out.println(maxProductBetter(arr));

    }
    // Take Time Complexity of O(NLogN) as we are using Arrays.sort method
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max1  = nums[nums.length-1];
        int max2 = nums[nums.length-2];
        return (max1-1)*(max2-1);

    }

    // Take Time Complexity of O(N) as we are iterating in the array of one time to find two maximum numbers

    public static int maxProductBetter(int [] nums){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] >= max2){
                max2 = nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}
