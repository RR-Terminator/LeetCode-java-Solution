import java.util.Arrays;

public class LeetCode_Problem_1365 {
    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] smallerNumbersThanCurrent(int[] arr) {

//        int [] arr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length ; j++) {
//
//
//                if (nums[i] > nums[j]  ) {
//                    count++;
//                }
//                arr[i]=count;
//            }
//        }
//        return arr;


        int [] ans = new int[arr.length];

        int [] freq = new int[101];
        for (int i : arr ) {
            freq[i]++;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i-1];
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                ans[i] = 0;

            }
            else ans[i] = freq[arr[i]-1];

        }

        return ans;

    }
}
//    int [] arr = new int[nums.length];
//      for(int i = 0; i<nums.length; i++){
//        for(int j = 0; j<nums.length; j++){
//        if(nums[i]>nums[j]) arr[i]++;
//        }
//        }