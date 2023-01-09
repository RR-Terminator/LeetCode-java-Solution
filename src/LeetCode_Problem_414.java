import java.util.Arrays;

public class LeetCode_Problem_414 {
    public static void main(String[] args) {

        int [] arr = {2,2,3,1};
        System.out.println(thirdMaxBetter(arr));


    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length,count = 1;
        if(n < 3)return nums[n-1];
        for(int i = n-2 ;i>= 0;i--){
            if(nums[i + 1] != nums[i])count++;
            if(count == 3)return nums[i];
        }
        return nums[n-1];
    }


    public static int thirdMaxBetter(int[] nums) {

        Integer FirstMax = null ;
        Integer secondMax = null ;
        Integer ThirdMax = null;

        int i = 0;

        if (nums.length < 3) {
            return nums[nums.length-1];
        }
        while (i < nums.length){
            Integer num = nums[i];

            if(num.equals(FirstMax)||num.equals(secondMax)||num.equals(ThirdMax)) {
                i++;
                continue;
            }
             if ( FirstMax == null || num > FirstMax) {
                ThirdMax = secondMax;
                secondMax = FirstMax;
                FirstMax = num;
            }
            else if ( secondMax == null || num > secondMax) {
                 ThirdMax = secondMax;
                 secondMax = num;
            }
            else if (  ThirdMax == null ||num > ThirdMax) {
                ThirdMax = num;
            }
            i++;
        }
        if (ThirdMax == null){
            return FirstMax;
        }
        else return ThirdMax;
       }
    }




