import java.util.Arrays;

public class LeetCode_Problem_1331 {
    public static void main(String[] args) {
        int [] arr = {100,100,100};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
     }
    public static int[] arrayRankTransform(int[] arr) {
        Arrays.sort(arr);

        int [] ans = new int[arr.length];

        int [] freq = new int[101];
        for (int i : arr ) {
            freq[i]++;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i-1];
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                ans[i] = 0;

            }
            else ans[i] = freq[arr[i]-1];

        }

        return ans;

    }
}
