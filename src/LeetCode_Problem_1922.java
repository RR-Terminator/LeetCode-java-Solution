public class LeetCode_Problem_1922 {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));

    }
    static int MOD = 1_000_000_007;
    public static  int countGoodNumbers(long n) {
        long oddCount =  n / 2 ;
        long evenCount = n - oddCount;

        long evenPos = Power(5,evenCount)%MOD;
        long oddPos = Power(4,oddCount)%MOD;

        int ans = (int)( (evenPos * oddPos)%MOD);
        return ans;

    }

    public  static long Power(int x , long y){
        long ans;
        if(y==0) return 1;
        if(y==1){
            return x;
        }
        long smallans = Power(x,y/2)%MOD;
        if(y%2==0) {
            ans = smallans*smallans;

        }
        else {
            ans = (smallans*smallans)*x;

        }
        return ans;
    }
}
