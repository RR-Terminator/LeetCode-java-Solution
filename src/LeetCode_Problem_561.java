import java.util.Arrays;

public class LeetCode_Problem_561 {
    public static void main(String[] args) {
       int [] arr = {1,3,4,2};
        System.out.println(arrayPairSum(arr));
    }
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
