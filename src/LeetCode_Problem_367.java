public class LeetCode_Problem_367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }

    public static boolean isPerfectSquare(int num) {
//        if (num == 1) {
//            return true;
//        }
        long s = 0;
        long e = num;
        while (s<=e){
            long mid = s+(e-s)/2;
            // check if mid*mid > num
            //in that case all num after it are greater than m
            // then e =mid-1
            if (mid*mid == num) {
                return true;
            }
            else if (mid*mid > num) {
                e = mid-1;
            }
            else s = mid+1;
        }

        return false;


    }
}
