
import java.util.Arrays;

public class LeetCode_Problem_167 {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;


        while (s<=e){
            int sum = numbers[s]+numbers[e];
            if(sum>target){
               e -=1;
            }
            else if(sum<target){
               s += 1;
            }
            else {
              return new int[] { s+1, e+1};
            }
        }
        return new int[] {-1,-1};
    }


}
