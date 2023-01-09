public class LeetCode_Problem_55 {
    public static void main(String[] args) {

        int [] arr ={3,2,1,0,4};
        System.out.println(canJump(arr));

    }

    // Greedy Approach

    public static boolean GreedyCanJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;

    }

    public static boolean  canJump(int[] nums) {
        int ReachablePosition = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (ReachablePosition < i) {
                return false;
            }
            ReachablePosition = Math.max(ReachablePosition,i+nums[i]);
        }
        return true;

    }

}
