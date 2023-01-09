import java.util.Arrays;

public class LeetCode_Problem_1502 {
    public static void main(String[] args) {

        int  [] arr ={1,2};
        System.out.println(canMakeArithmeticProgression(arr));

    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 2) {
            return true;
        }
        final int diff = arr[1]-arr[0];
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]- arr[i] == diff){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
         return flag;
    }
    
}
