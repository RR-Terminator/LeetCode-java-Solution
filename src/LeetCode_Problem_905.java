import java.util.Arrays;

public class LeetCode_Problem_905 {
    public static void main(String[] args) {

        int [] arr = {2,3,1,4};
        System.out.println(Arrays.toString(sortArrayByParityBetter(arr)));

    }

    // Works But Takes more time ....

//    public static int[] sortArrayByParity(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//            if ( nums[i]%2 != 0) {
//                for (int j = i+1 ; j < nums.length; j++) {
//                    if (nums[j]%2 != 0) {
//                        continue;
//                    }
//                    else Swap(nums,i,j);
//                }
//            }
//        }
//        return nums;
//
//    }


    // Take O(N^2) as two loops are running..

    public static int[] sortArrayByParity(int[] nums) {
        int [] arr = new int[nums.length];
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0) {
                arr[counter] = nums[i];
                counter++;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]%2 != 0) {
                arr[counter] = nums[i];
                counter++;
            }

        }
        return arr;
    }


    // Time Complexity O(N) as one loop is used and each element is traversing

    public static int[] sortArrayByParityBetter(int[] nums) {
        int [] arr = new int[nums.length];
        int evencounter = 0;
        int oddcounter = arr.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0) {
                arr[evencounter] = nums[i];
                evencounter++;
            }
            else {
                arr[oddcounter] = nums[i];
                oddcounter--;
            }
        }

        return arr;
    }


    public static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
