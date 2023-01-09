public class LeetCode_Problem_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        //System.out.println(FindSquare(100));
    }


    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = FindSquare(slow);
            fast = FindSquare(FindSquare(fast));
        } while (slow != fast);
        return slow == 1;
    }
    public static int FindSquare(int n){
        int ans =0;
        while (n > 0){
            int rem = n %10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;

    }


}
