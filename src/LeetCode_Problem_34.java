import java.util.Arrays;

public class LeetCode_Problem_34 {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    static  int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        int start = Find(nums,target,true);
        int end = Find(nums,target,false);
        ans[0] = start;
        ans[1]=end;
        return ans;

    }
    static int  Find(int [] arr, int target, boolean StartIndex){
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int m = s + (e-s)/2;
            if (target>arr[m]) s = m+1;
            else if (target < arr[m]) e =m-1;
            else {
                ans = m;
                if(StartIndex){
                    e = m-1;
                }
                else s =m+1;
            }



        }
        return ans;
    }
}
