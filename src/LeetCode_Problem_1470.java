import java.util.Arrays;

public class LeetCode_Problem_1470 {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr,3)));


    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0, j = 0;
        while(i<n){
            ans[j]=nums[i];
            ans[j+1]=nums[i+n];
            i++;
            j+=2;
        }
        return ans;
    }
}
