public class LeetCode_Problem_35 {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7};
        System.out.println(searchInsert(arr,2));

    }
    public static int  searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        } else {

            int s = 0;
            int e = nums.length - 1;

            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }


            }


            return s;
        }
    }



}
