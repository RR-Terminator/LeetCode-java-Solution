public class LeetCode_Problem_1342 {
    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        return numberOfStepsHelper(num,0);
    }

    private static int numberOfStepsHelper(int num, int steps) {
        //Base Case :- check whether num == 0 if number is 0 then there is no need of performing steps
        if (num == 0) {
            return steps;

        }
        //if number is even then divide it by 2 and step = step+1;
        if (num%2 == 0) {
            return numberOfStepsHelper(num/2,steps+1);
        }

        // if number is not divided ny 2 then number -1 step  = step +1
        return numberOfStepsHelper(num-1,steps+1);


    }

//



}
