public class LeetCode_Problem_134 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(arr1,arr2));
    }

    public  static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        for(int i: gas){
            totalgas +=i;
        }
        int totalcost = 0;
        for(int i : cost){
            totalcost +=i;
        }
        if(totalgas < totalcost) return -1;
        int current = 0;
        int start = 0;
        int i = 0 ;
        while (i < gas.length) {
            current+=gas[i]-cost[i];
            if(current < 0 ){
                current = 0;
                start = i+1;
            }

            i++;
        }
        return start;

    }
}
