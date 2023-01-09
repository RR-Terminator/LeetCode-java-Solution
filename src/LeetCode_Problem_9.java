public class LeetCode_Problem_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));

    }

    public static boolean isPalindrome(int x) {


        /// check if the number is negative or the number is divisible by 10 then we can not be says as a palindrome .

        if (x < 0 || x%10==0 && x!=0) {
            return false;
        }
        // creating an int object to store the number in reverse order till the middle of the original int
        int mid = 0;
        //check if the mid is excluding the 1/2 length of the original in x
        while (x>mid){
            mid = mid *10 + x%10;
            x = x/10;
        }
        return mid==x || mid/10 ==x;
//         if mid-stores 1/2 then check the value of both of the objects i.e. x and mid if they are equal then return true
//         else return false these case is for even length of the x
//         if x length is odd then check if mid/10 == x then it can be said that it is  palindrome then return true
//        else return false
//
//         example of even length x = 1221
//
//         on first while loop mid = 1 and x =122
//         on second while loop mid =12 and x = 12
//          on third while loop iteration x > mid-condition false
//         while loop break check if mid/10 == x or not
//         in these case 10 /10 = 1 and x =1 hence condition satisfies  return true
//
//
//         for example x =101 id odd length
//         on first while loop mid = 1 and x =10
//         on second while loop mid =10 and x = 1
//          on third while loop iteration x > mid-condition false 12 >12
//         while loop break check if mid == x
//         in these case mid =12 and x =12 hence condition satisfies  return true
//
//
//         consider odd length x and not a palindrome  x =102;
//         on first while loop mid = 2 and x =10
//         on second while loop mid =20 and x = 1
//          on third while loop iteration x > mid-condition false
//         while loop break check if mid/10 == x or not
//         in these case 20 /10 = 2 and x =1 hence condition not  satisfies  return false

    }


}
