public class LeetCode_Problem_2244 {

    public static void main(String[] args) {
        int [] arr ={1,1000000000};
      // System.out.println(minimumRounds(arr));
    }

    // Time Complexity O(n^2);
    // Space Complexity(n);

//    public static int minimumRounds(int[] tasks) {
//
//        int counter = 0;
//        int max = Integer.MIN_VALUE;
//        for (int elements : tasks) {
//            max = Math.max(max,elements);
//        }
//        int [] freqArr = new int[max+1];
//        for (int element:tasks) {
//            freqArr[element]++;
//        }
//
//        for (int i = 0; i < freqArr.length-1; i++) {
//            if (freqArr[i] == 1) {
//                return -1;
//            } else if (freqArr[i]%3==0) {
//                counter+=freqArr[i]/3+1;
//            }
//            else {
//                counter += freqArr[i]/3;
//            }
//        }
//        return counter;
//    }

}
