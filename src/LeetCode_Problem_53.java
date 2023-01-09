public class LeetCode_Problem_53 {

    // Kadens Algorithm use

    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }
    public static int maxSubArray(int[] arr) {
        int  maxSum =arr[0];
        int currentSum = 0;
        for (int i = 0 ; i<arr.length;i++){
            currentSum +=arr[i];
            maxSum= Math.max(maxSum,currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }

        }
        return maxSum;
    }
}
