public class LeetCode_Problem_326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(16));
    }
    //Recursive Solution;
    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n%3 == 0) {
            return isPowerOfThree(n/3);

        }
        else return false;
    }
}
