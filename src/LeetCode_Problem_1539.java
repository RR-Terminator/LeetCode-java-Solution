public class LeetCode_Problem_1539 {
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        System.out.println(findKthPositive(arr,2));
    }
    public static int findKthPositive(int[] arr, int k) {
        int s = 0;
        int e = arr.length-1;
        int i = 0;
        while (s<=e){
            int m = s +(e-s)/2;
            if(arr[m]-(m+1)<k){
                i = m+1;
                s = m+1;
            }
            else{
                e = m-1;
            }

        }
        return k+i;

    }
}
