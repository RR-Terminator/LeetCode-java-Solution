public class LeetCode_Problem_121 {

    public static void main(String[] args) {
        int [] arr ={7,10,1,13,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] arr) {
        int buyPrice = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {

            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else  buyPrice = arr[i];

        }
        return maxProfit;
    }
}
