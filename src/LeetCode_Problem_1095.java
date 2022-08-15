public class LeetCode_Problem_1095 {
    public static void main(String[] args) {

    }

  static int ans (int[] arr, int target){
        int peak =peakIndexInMountainArray(arr);
        int FirstTry = BinarySearh(arr,target,0,peak);
      if (FirstTry != -1) {
          return FirstTry;

      }
      return BinarySearh(arr,target,peak+1,arr.length-1);

  }


    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start =mid+1;
            }
        }
        return start;

    }

    static int BinarySearh(int [] arr, int target, int start, int end){



        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]) {
                    end = mid-1;
                }
                else  {
                    start = mid+1;
                }
            }


            else {
                if (target > arr[mid]) {
                    end = mid-1;
                }
                else  {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
