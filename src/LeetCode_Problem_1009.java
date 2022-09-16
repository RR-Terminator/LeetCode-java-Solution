public class LeetCode_Problem_1009 {
    public static void main(String[] args) {

        System.out.println(bitwiseComplement(5));

    }

    public static int bitwiseComplement(int n) {

        if (n == 0) {
            return 1;
        }

        int m = n;
        int mask = 0;
        while (m!=0){
            mask = (mask<<1)|1;
            m = m >>1;
        }

        int answer = (~n)&mask;
        return answer;


    }

}
