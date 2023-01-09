import java.util.Arrays;

public class LeetCode_Problem_1491 {
    public static void main(String[] args) {

        int [] arr ={1000,2000,3000};
        System.out.println(average(arr));

    }
    public static double average(int[] salary) {

        double ans  = 0;
        Arrays.sort(salary);
        int i = 1;
        while (i<salary.length-1){
            ans+=salary[i];
            i++;
        }
        i = i-1;
        ans = ans/i;
        return ans;

    }

//    Input: salary = [4000,3000,1000,2000]
//    Output: 2500.00000
//    Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//    Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

}
