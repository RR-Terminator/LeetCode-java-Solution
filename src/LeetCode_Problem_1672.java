public class LeetCode_Problem_1672 {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));

    }

    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        int sum = Integer.MIN_VALUE;
        for(int i =0; i<=accounts.length -1 ; i++){
            for(int j =0; j<=accounts[0].length -1 ; j++){
                ans += accounts[i][j];
            }
            sum = Math.max(sum,ans);
            ans =0;

        }
        return sum;
    }


}
