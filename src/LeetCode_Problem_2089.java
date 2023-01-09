import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode_Problem_2089 {
    public static void main(String[] args) {
        int [] arr = {100,1,100};
        System.out.println(targetIndices(arr,100));
    }

//    public static List<Integer> targetIndices(int[] nums, int target) {
//        Arrays.sort(nums);
//        ArrayList<Integer> list =new ArrayList<>();
//        int si = 0;
//        int ei = nums.length-1;
//        while(si<=ei){
//            int mid = si + (ei-si)/2;
//            if (nums[mid] == target) {
//                list.add(mid);
//            }
//            if (nums[mid] < target) {
//                si =mid+1;
//            }
//            else  ei = mid -1;
//        }
//        Collections.sort(list);
//        return list;
//    }
    public static List<Integer> targetIndices(int [] nums, int target){
        List<Integer> list= new ArrayList<>();
        Arrays.sort(nums);
        for (int element = 0; element< nums .length;element++) {
            if (nums[element] == target) {
                list.add(element);
            }
        }
        return list;
    }
}
