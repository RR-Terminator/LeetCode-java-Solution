import java.util.HashMap;

public class LeetCode_Problem_169 {
    public static void main(String[] args) {
        int [] arr = {3,2,2};
        System.out.println(majorityElement(arr));
    }
    public  static  int majorityElement(int[] a) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        HashMap<Integer , Integer> map = new HashMap<>();


        for (int j : a) {

            if (map.containsKey(j)) {
                int value = map.get(j) + 1;
                map.put(j, value);
            } else {
                map.put(j, 1);
            }
            if (map.get(j) > a.length / 2) return j;

        }

        return -1;

    }
}
