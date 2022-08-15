import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_Problem_1431 {
    public static void main(String[] args) {
        int [] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = candies[0]+extraCandies;
        for (int i = 0; i < candies.length; i++) {

            int sum = candies[i]+extraCandies;
            if(sum >= max) {
                max = candies[i];
                list.add(true);
            }
            else{
                list.add(false);
            }

        }
        return list;
//         ArrayList<Boolean> list = new ArrayList<>();
//
//        for (int i = 0; i < candies.length; i++) {
//        int max = candies[i];
//            for (int j = i; j < candies.length; j++) {
//                if (candies[j]>max){
//                    max=candies[j];
//                }
//            }
//        int sum = candies[i]+extraCandies;
//        if(sum > max) {
//            max = candies[i];
//            list.add(true);
//        }
//        else{
//            list.add(false);
//        }
//
//    }
//        return list;

        }

    }


