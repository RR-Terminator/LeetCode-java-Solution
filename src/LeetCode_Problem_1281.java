public class LeetCode_Problem_1281 {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        int mul = 1;
        int add = 0;
        while(n!=0){
            int digit = n%10;

            mul = mul*digit;
            add = add + digit;

            n = n/10;

        }

        int answer = mul - add;
        return answer;
    }

}
