import java.util.Arrays;

public class LeetCode_Problem_1051 {
    public static void main(String[] args) {

        int [] arr ={1,1,4,2,1,3};
        System.out.println(heightChecker(arr));

    }
    public static int heightChecker(int[] heights) {
        int [] arr = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != arr[i]) {
                count++;
            }

        }
        return count;


    }
}
