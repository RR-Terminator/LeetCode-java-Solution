public class LeetCode_Problem_344 {
    public static void main(String[] args) {
        char [] arr ={'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(arr);
    }
    public static void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
    public static void helper(char[] arr , int s , int e){

        if (s >= e) {
            return;
        }

        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        helper(arr,s+1,e-1);

    }
}
