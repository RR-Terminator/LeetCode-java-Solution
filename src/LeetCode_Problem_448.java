import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_Problem_448 {

    public static void main(String[] args) {

        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i]-1;
            if ( nums[i] != nums[correctIndex]) {
                Swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                list.add(j+1);

            }
        }

        return list;

    }

    static void cyclesort(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i]-1;
            if ( nums[i] != nums[correctIndex]) {
                Swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
