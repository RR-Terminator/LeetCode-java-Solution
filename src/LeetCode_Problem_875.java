public class LeetCode_Problem_875 {
    public static void main(String[] args) {

        int [] arr = {3,6,7,11};
        System.out.println(minEatingSpeed(arr,8));

    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int current:piles) {
            max = Math.max(current,max);
        }
        int start = 0 ;
        int end = max;
        int speed = Integer.MAX_VALUE;

        while(start <= end){

            int AverageSpeed = start+(end-start)/2;
            if(isPossible(piles, h, AverageSpeed)){
                speed = AverageSpeed;
                end = AverageSpeed-1;
            }
            else {
                start = AverageSpeed+1;
            }
        }
        return speed;
    }

    public static boolean isPossible(int [] arr,int period, int AverageSpeed){
        int time = 0;
        for (int j : arr) {
            if (j%AverageSpeed == 0) {
                time+=j/AverageSpeed;
            }
            else {
                time+= (j/AverageSpeed)+1;
            }
        }
        return time<=period;
    }

}
