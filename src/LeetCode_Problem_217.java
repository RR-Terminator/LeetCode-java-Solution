import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_Problem_217 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
        int [] arr1 = {1,2,1,3,4};
        System.out.println(containsDuplicate(arr1));

    }
//    public static boolean containsDuplicate(int[] nums) {
//
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean containsDuplicate(int[] a) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int j : a) {

            if (map.containsKey(j)) {
                int value = map.get(j) + 1;

                map.put(j, value);
            } else {
                map.put(j, 1);
            }
            if (map.get(j) > 1) return true;

        }
        return false;

    }
    }








