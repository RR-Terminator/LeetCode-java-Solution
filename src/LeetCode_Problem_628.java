import java.util.Arrays;
import java.util.Vector;

public class LeetCode_Problem_628 {
    public static void main(String[] args) {
        int [] arr = {-6,1,2,3,4,5};
        System.out.println(maximumProductBetter(arr));

    }

    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int v1 =  nums[0]*nums[1]*nums[nums.length-1];
        int v2 = nums[nums.length-1]* nums[nums.length-2]* nums[nums.length-3];
        return Math.max(v1,v2);

    }


    public static int maximumProductBetter(int[] nums) {

        int  FirstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE ;
        int ThirdMax = Integer.MIN_VALUE;

        int FirstMin = Integer.MAX_VALUE;
        int SecondMin = Integer.MAX_VALUE;

        int i = 0;

        while (i < nums.length){
            Integer num = nums[i];


            if ( num > FirstMax) {
                ThirdMax = secondMax;
                secondMax = FirstMax;
                FirstMax = num;
                i++;
            }
            else if (num >= secondMax) {
                ThirdMax = secondMax;
                secondMax = num;
                i++;
            }
            else if (num >= ThirdMax) {
                ThirdMax = num;
                i++;
            }

            if (num <= FirstMin) {
                SecondMin = FirstMin;
                FirstMin = num;
                i++;
            } else if (num <= SecondMin) {
                SecondMin = num;
                i++;
            }


        }

        int v1 =  FirstMin*SecondMin*FirstMax;
        int v2 = FirstMax*secondMax*ThirdMax;
        return Math.max(v1,v2);

    }


}
