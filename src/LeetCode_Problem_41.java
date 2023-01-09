public class LeetCode_Problem_41 {
    //LeetCode hard
    public static void main(String[] args) {

        int [] arr ={3,4,-1,1};
        System.out.println(firstMissingPositive(arr));

    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] > 0 && nums[i]<=nums.length && nums[i]!=nums[correctIndex]){
                Swap(nums, i , correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index < nums.length ; index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }

        return nums.length+1;

//
//        int i = 0;
//        while(i < nums.length){
//            int correct = nums[i]-1;
//            if (nums[i] < 0 && nums[i] <= nums.length &&  nums[i] != nums[correct]) {
//                Swap(nums,i, correct);
//            }
//            else {
//                i++;
//            }
//        }
//        for (int j = 0; j < nums.length; j++) {
//            if (nums[j] != j+1) {
//                return j+1;
//            }
//
//        }
//        return nums.length+1;
    }


    public int firstMissingPositiveBetter(int[] nums) {

        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if (nums[i] > 0 && nums[i] <= nums.length &&  nums[i] != nums[correct]) {
                Swap(nums,i, correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return j+1;
            }

        }
        return nums.length+1;
    }





    public static void Swap(int [] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
