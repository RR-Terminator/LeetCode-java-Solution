import java.util.Arrays;

public class LeetCode_Problem_922 {
    public static void main(String[] args) {
        int [] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }


    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0 ;
        int j = 1;
        while (i< nums.length&& j< nums.length){
            while(i< nums.length && nums[i] %2 ==0){
                i+=2;
            }
            while(j< nums.length && nums[j] %2 ==1){
                j+=2;
            }
            if (i< nums.length&& j< nums.length ) {
                Swap(nums,i,j);
            }
        }

      return nums;

    }

    public static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
