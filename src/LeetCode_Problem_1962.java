//import java.util.*;
//
//public class LeetCode_Problem_1962 {
//    public static void main(String[] args) {
//        int []  piles = {5,4,9};
//        System.out.println(minStoneSum(piles,2));
//
//    }
//    public static int minStoneSum(int[] piles, int k) {
//        // Sort the piles in decreasing order
//        Arrays.sort(piles, Collections.reverseOrder());
//
//        // Initialize the total number of stones removed to 0
//        int stonesRemoved = 0;
//
//        // While there are more than k piles
//        while (piles.length > k) {
//            // Remove floor(piles[0] / 2) stones from the first pile
//            stonesRemoved += piles[0] / 2;
//            piles[0] /= 2;
//
//            // Remove the first pile from the list of piles if its number of stones is 0
//            if (piles[0] == 0) {
//                piles = Arrays.copyOfRange(piles, 1, piles.length);
//            }
//        }
//
//        // Initialize the remaining number of stones to the sum of the remaining piles
//        int remaining = 0;
//        for (int i = 0; i < piles.length; i++) {
//            remaining += piles[i];
//        }
//
//        // For i = 0 to k - 1
//        for (int i = 0; i < k; i++) {
//            // Remove floor(piles[i] / 2) stones from the ith pile
//            remaining -= piles[i] / 2;
//            piles[i] /= 2;
//        }
//
//        return remaining;
//    }
//
//}
