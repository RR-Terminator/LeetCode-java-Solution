import java.util.Arrays;

public class LeetCode_Problem_976 {
    public static void main(String[] args) {
        int [] arr ={3,2,3,4};
        System.out.println(largestPerimeterBetter(arr));

    }
    public static int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        int peri = 0;
        for (int i = nums.length-1; i >=2 ; i--) {
            if (nums[i-1]+nums[i-2] > nums[i]) {
                peri  = nums[i-1]+nums[i-2]+nums[i];
                break;
            }
        }
        return peri;
    }

    public static int largestPerimeterBetter(int[] nums) {
        swapMaxElement(nums, nums.length - 1);
        swapMaxElement(nums, nums.length - 2);
        for (int i = nums.length - 1; i >= 2; i--) {
            swapMaxElement(nums, i - 2);
            if (nums[i] < nums[i - 1] + nums[i - 2])
                return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
    }


    private static void swapMaxElement(int[] nums, int index) {
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i <= index; i++)
            if (nums[i] > max)
                max = nums[(maxIndex = i)];
        nums[maxIndex] = nums[index];
        nums[index] = max;
    }

}
