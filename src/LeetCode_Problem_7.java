public class LeetCode_Problem_7 {


    public static void main(String[] args) {
        System.out.println(reverse(1534));

    }

    public static int reverse(int x) {

        Integer answer = 0;
        while (x!=0){
            int digit = x%10;

            if (answer < Integer.MIN_VALUE/10 || answer  > Integer.MAX_VALUE/10) {
                return 0;
            }

            answer = answer * 10 + digit;

            x = x/10;

        }



        return answer;

    }




    }
