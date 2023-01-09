import java.util.Arrays;
// * *
public class LeetCode_Problem_1833 {
    public static void main(String[] args) {
        int [] arr = {1,6,3,1,2,5};
        System.out.println(maxIceCream(arr,20));

    }
    public static int maxIceCream(int[] costs, int coins) {
        if(costs.length==0) return 0;
        Arrays.sort(costs);
        int ans  = 0;
        for(int element : costs){
            if(element<=coins && coins >0){
                ans++;
                coins = coins - element;
            }
        }
        return ans;
    }
}
