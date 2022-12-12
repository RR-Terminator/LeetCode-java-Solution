public class LeetCode_Problem_231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }

//    public static boolean isPowerOfTwo(int n) {
//
//        for (int i = 0; i <= 30; i++) {
//            int answer = (int) Math.pow(2,i);
//            if (answer == n) {
//                return true;
//            }
//        }
//
//        return false;
//
//    }

    // Recursive solution :-

    public static boolean isPowerOfTwo(int n) {

        //Base Case : if n = 0 return false
        if (n == 0) {
            return false;
        }
        // Another base case if n = 1 return true as 2^0 = 1

        if (n == 1) {
            return true;
        }

//         check if n%2 = 0 as 2 powers are always even number their division will give a number which is even
//         consider case of 18 18%2 == 0 and 18/2 = 9 and 9%2!=0 hence return false
//         eg 16 16%2 = 0 ,16/2 = 8 ,8%2 =0 ,8/2 =4 ,4%2 = 0, 4/2 = 2, 2%2 = 0 ,2/2 = 1 return true
        if (n%2 == 0) {
            return isPowerOfTwo(n/2);

        }
        else return false;

    }

}
