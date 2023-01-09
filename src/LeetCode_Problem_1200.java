import java.util.*;

import static java.lang.Math.abs;

public class LeetCode_Problem_1200 {
    public static void main(String[] args) {

        int [] arr = {40,11,26,27,-20};
        System.out.println((minimumAbsDifference(arr)));

    }



    public static  List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> Answer = new ArrayList<>();
        int mindiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            int foundmin = arr[i]-arr[i+1];
            mindiff = Math.min(Math.abs(foundmin),mindiff);
        }


        int index = 0;
        while (index < arr.length-1){
            if (arr[index+1]-arr[index] == mindiff) {
                mindiff = arr[index+1]-arr[index];
                ArrayList<Integer> subAnswer = new ArrayList<>();
                subAnswer.add(arr[index]);
                subAnswer.add(arr[index+1]);
                index++;
                Answer.add(subAnswer);
            }
            else index++;
        }
        return Answer;


    }

}
