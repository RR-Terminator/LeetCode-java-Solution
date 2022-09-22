public class LeetCode_Problem_278 {
    public static void main(String[] args) {
        isBadVersion(4);
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        int s = 0;
        int e = n;
        while(s<=e){
            int m = s + (e-s) /2;
            if(isBadVersion(m)){
                e = m-1 ;
            }
            else{
                s = m+1;
            }
        }
        return s;
    }

    private static boolean isBadVersion(int n) {


        return true;
    }



}