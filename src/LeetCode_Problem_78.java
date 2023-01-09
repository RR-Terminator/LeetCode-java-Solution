import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_Problem_78 {
    public static void main(String[] args) {

        int []  ans = {1,2,3};
        System.out.println((subsets(ans)));

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList <Integer> output = new ArrayList<>();
        int Index = 0;
        solve(nums,output,Index,ans);
        return ans;

    }

    private static void solve(int[] nums, ArrayList<Integer> output, int index, List<List<Integer>> ans) {
        if (index >= output.size()) {
            ans.add(output);
            return;
        }

        solve(nums,output,index+1,ans);
        int element = nums[index];
        output.add(element);
        solve(nums,output,index+1,ans);


    }


}
