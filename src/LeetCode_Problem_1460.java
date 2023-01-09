import java.util.Arrays;

public class LeetCode_Problem_1460 {
    public static void main(String[] args) {
        int [] arr1 = {1,3,4};
        int [] arr2 = {4,2,1};
        System.out.println(canBeEqualBetter(arr1,arr2));

    }
    // Time Complexity 0(NlogN) as we use Arrays.Sort() to sort the array..

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        boolean flag = false;
        for (int i = 0; i < target.length; i++) {
            if (arr[i] == target[i]) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    // Time Complexity O(N) as we are only iterating to the elements O(N)+O(N)+O(N) = O(3N) = O(N);

    public static boolean canBeEqualBetter(int[] target, int[] arr){
        int [] temp = new int[1001];
        for (int i: target) {
            temp[i]++;
        }
        for (int i: arr ) {
            temp[i]--;
        }
        for (int i = 0; i < 1001; i++) {
            if (temp[i]<0) return false;
        }
        return true;


    }








    }


