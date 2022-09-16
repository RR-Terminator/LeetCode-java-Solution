public class LeetCode_Problem_231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }

    public static boolean isPowerOfTwo(int n) {

        for (int i = 0; i <= n; i++) {
            int answer = (int) Math.pow(2,i);
            if (answer == n) {
                return true;
            }
        }

        return false;

    }

//    public  boolean isPowerOfTwo(int n) {
//        if(n<=0)
//            return false;
//        return (n & n-1)==0;
//
//    }

}
