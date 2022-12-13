public class LeetCode_Problem_287 {
    public static void main(String[] args) {
        int [] arr ={1,3,4,2,2};

        System.out.println(findDuplicate(arr));


    }

    public static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i+1) {
                int correctIndex = nums[i]-1;
                if ( nums[i] != nums[correctIndex]) {
                    Swap(nums, i, correctIndex);
                } else {
                    return  nums[i];
                }
            }
            else i++;
        }
        return -1;




    }
    public static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
