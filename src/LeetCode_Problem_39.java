import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode_Problem_39 {
    public static void main(String[] args) {
        int [] arr = {2,3,6,7};

        System.out.println(combinationSum(arr,7));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) {
            return null;
        }
        List<List<Integer>> list = new ArrayList<>();

        findCombination(0,candidates,target,new ArrayList<>() ,list);
        return list;
    }

    private static void findCombination(int start,int[] candidates, int target, ArrayList<Integer> Current,
                                        List<List<Integer>> list) {
        if (target == 0) {
            list.add(new ArrayList<>(Current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length && i<= target; i++) {
            Current.add(candidates[i]);
            findCombination(i,candidates,target-candidates[i],Current,list);
            Current.remove(Current.size()-1);
        }



    }

    // these work fine but gives the repeated ans ...

//    private static void findCombination(int[] candidates, int target,
//                                        ArrayList<Integer> current, List<List<Integer>> list) {
//        if (target == 0) {
//            list.add(new ArrayList<>(current));
//            return;
//        }
//
//        for (int i = 0; i < candidates.length && i<= target; i++) {
//            current.add(candidates[i]);
//            findCombination(candidates,target-candidates[i],current,list);
//            current.remove(current.size()-1);
//        }
//
//    }
}
