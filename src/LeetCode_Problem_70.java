public class LeetCode_Problem_70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
//        public static int climbStairs(int n) {
////
////        }

    // works Better But takes Extra Spaces:- Space Complexity O(n+1)
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];

    }

// Solution  By Recursion But gives TLE and can be optimized using Dp later:-
//    public static int climbStairs(int n) {
//        if (n == 1){
//            return 1;
//        }
//        if(n==2){
//            return 2;
//        }
//        return climbStairs(n-1)+climbStairs(n-2);
//    }

}
