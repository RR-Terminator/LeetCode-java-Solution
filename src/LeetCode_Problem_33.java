public class LeetCode_Problem_33 {
    public static void main(String[] args) {
       int [] arr = {4,5,6,7,0,1,2};

        System.out.println(Search(arr,1));
    }
    static int Search(int [] nums , int target){
//        int pivot = FindPivot(nums);
//
//        // if you did not find a pivot, it means the array is not rotated
//        if (pivot == -1) {
//            // just do normal binary search
//            return binarySearch(nums, target, 0 , nums.length - 1);
//        }
//
//        // if pivot is found, you have found 2 asc sorted arrays
//        if (nums[pivot] == target) {
//            return pivot;
//        }
//
//        if (target >= nums[0]) {
//            return binarySearch(nums, target, 0, pivot - 1);
//        }
//
//        return binarySearch(nums, target, pivot + 1, nums.length - 1);

        return solutionByRecursion(nums,target,0, nums.length-1);
    }
    static int FindPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(mid > end && arr[mid]>arr[mid+1]) return mid;
            if(mid > start && arr[mid]< arr[mid-1]) return mid-1;
            if (arr[mid]<=arr[start]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }


     //Recursion solution to the rotated binary search
    static int solutionByRecursion(int [] arr, int target , int s , int e){

        //base case : -
        if(s>e) return -1;

        // Finding the middle element
        int mid = s + (e-s)/2;

        // checking if the middle element is equal to target or not...
        if (arr[mid] == target) return mid;

        // checking if the target element is smaller than the middle element
        if (arr[mid] >= target) {

            // if the target element is smaller than the middle element check if the starting portion is sorted or not
            //and also check starting element is greater than or equal to the target or not ...
            if (arr[mid] >= arr[s] && arr[s]<=target) {
                // in that case reduce the search space to the left side that is e = mid -1
                return solutionByRecursion(arr,target,s,mid-1);
            }
            // else move towards right part that is s = mid + 1
            else return solutionByRecursion(arr,target,mid+1,e);

        }

        // check if the target element is greater than the middle element
        // also check for the if target element is smaller than the end element...
        if (arr[mid] <= target && target<=arr[e]) {
            // in such case reduce the search space to the left space ie s = mid +1 ..
            return solutionByRecursion(arr,target,mid+1,e);
        }
        // else search in the right space i.e. e = mid - 1;
        return  solutionByRecursion(arr,target,s,mid-1);

    }


}
