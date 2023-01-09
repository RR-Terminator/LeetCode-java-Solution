import java.util.Arrays;

public class LeetCode_Problem_75 {

    public static void main(String[] args) {

        int [] arr ={0,1,0,2,1,2,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sortColors(int[] nums) {
        int [] arr = new int[3];
        for (int i: nums ) {
            arr[i]++;
        }
        int si = 0;
        int index = 0;

        while (si< arr.length){
            int count = arr[si];
            while (count>0){
                nums[index]=si;
                index++;
                count--;
            }
            si++;
        }

    }

}
