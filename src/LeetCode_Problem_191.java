public class LeetCode_Problem_191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(10111));
    }

    // approach is Right
    // try to run no leet Code.

//    public static int hammingWeight(int n) {
//        int count = 0;
//        for(int i = 0; i<32; i++){
//            if((n & 1) == 1){
//                count++;
//            }
//            n >>=1;
//        }
//        return count;
//    }
        public static int hammingWeight(int n) {

        int count = 0;
        while(n!=0){
            n = n & (n - 1);
            count++;
        }
        return count;

        }


}
