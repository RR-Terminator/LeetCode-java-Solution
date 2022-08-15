public class LeetCode_Problem_1512 {
    public static void main(String[] args) {

        int [] arr ={1,2,1,1,3};
        System.out.println(numIdenticalPairs(arr));

    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        //int ans = count/2;
        return count;
    }
}
