import java.util.Arrays;

public class LeetCode_Problem_1929 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        int [] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));


    }
    static int[] getConcatenation(int[] nums) {
        int [] ans = new int[2*nums.length];
        for(int i = 0; i <= nums.length-1; i++){
            ans[i]=nums[i];
            ans[i+ nums.length]=nums[i];

        }
        return ans;

    }
}
