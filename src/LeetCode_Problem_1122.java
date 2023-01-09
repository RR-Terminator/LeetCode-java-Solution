import java.util.Arrays;

public class LeetCode_Problem_1122 {


    public static void main(String[] args) {

        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));



    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Bucket for 0 <= arr element <= 1000
        int[] bucket = new int[1001];

        int[] result = new int[arr1.length];
        int index = 0;

        // Fill bucket
        for(int i : arr1) {
            bucket[i]++;
        }

        // First store result in order of arr2
        for(int i : arr2) {
            while(bucket[i]-- > 0) {
                result[index++] = i;
            }
        }

        // Fill remaining element
        for(int i = 0; i < 1001; i++){
            if(bucket[i] > 0) {
                while(bucket[i]-- > 0) {
                    result[index++] = i;
                }
            }
        }
        return result;
    }

    public static void Swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }






}
