import java.util.Arrays;

public class LeetCode_Problem_1 {
    public static void main(String[] args) {

        int [] arr ={2,5,5,11};
        System.out.println(Arrays.toString(twoSum(arr,10)));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 1; i < nums.length; i++) {
            if (nums[i]+nums[i-1] == target) {
                return new int[]{i-1,i};
            }

        }
        return null;
    }
}
