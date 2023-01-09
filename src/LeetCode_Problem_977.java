import java.util.Arrays;

public class LeetCode_Problem_977 {
    public static void main(String[] args) {

    }
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]*=nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
