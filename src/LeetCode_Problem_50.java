public class LeetCode_Problem_50 {
    public static void main(String[] args) {
        System.out.println(myPow(8.95371,-1));
    }

    public static double myPow(double x, int n) {
        long power = n;
        return myPowHelper(x,power);

    }

    private static double myPowHelper(double x, long n){
        double result ;
        boolean flag = true; //

        if(n<0) {  // if n is negative  then flag will be  set to False
            flag = false;
            n = -1 * n ;
        } //base case : if n==o return 1
        if (n == 0) {
            return 1;
        }
        //check if given n is 1 if n= 1 then simply returns given number
        if(n==1){
            result = x;
        }
        // recursive  Call : call x and reduce the size of n to n/2
        // consider a case if x=2 n=10 then you can simply say (x^2)^5 the answer of ^5 call be call using
        // recursive call

        double smallans = myPow(x, (int) (n/2));
        // if n is odd multiple then you have to multiply with  one extra 'x' so you have to return smallans * smallans*x
        if (n%2 == 1) {
            result = x *smallans*smallans;
        }
        // else return smallans*smallans
        else result = smallans*smallans;

        //now check if the flag is set to false then ypu have to return the power in terms of x^-n
        //which is similar to 1/x^n in that case you have to return the 1/result
        if (!flag) {
            result = 1/result;
        }
        // else return the result in that case
        return result;

    }
}
