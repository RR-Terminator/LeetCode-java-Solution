import java.util.Arrays;

public class LeetCode_Problem_1920 {
    public static void main(String[] args) {
        int [] arr = {0,1,3,4,5,2};
        System.out.println(Arrays.toString(buildArray(arr)));

    }
    public static int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i =0; i < ans.length ; i++){
            ans[i] =nums[nums [i]];
        }
        return ans;
    }
}
