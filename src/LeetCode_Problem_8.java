//public class LeetCode_Problem_8 {
//    public static void main(String[] args) {
//
//        System.out.println(myAtoi("1234 with numbers"));
//
//    }
//
//    public static int myAtoi(String input) {
//
//
//        //Base Case : check the length of the string
//        int ans =0;
//
//        if(input.length()==0) return 0;
//        int sign = 1;
//        String s;
//        if(input.charAt(0)== ' '){
//             s = (input.substring(1,input.length()-1));
//            if(s.charAt(0)=='-'){
//                sign = -1;
//            }
//            String result =  s.substring(1,s.length()-1);
//            char ch = result.charAt(0);
//            int digit  = ch - '0';
//            int smallans = myAtoi(result.substring(0,s.length()-1));
//            if(digit>=0 && digit<=9){
//                ans= 10*smallans+digit*sign;
//                return ans;
//            }
//
//
//        }
//
//        else if(input.charAt(0)!= ' '){
//            if (input.charAt(0)=='-'){
//                sign = -1;
//            }
//            String result =  input.substring(1,input.length()-1);
//            char ch = result.charAt(0);
//            int digit  = ch - '0';
//            int smallans = myAtoi(result.substring(1,input.length()));
//            if(digit>=0 && digit<=9){
//                ans=10*smallans+digit*sign;
//                return ans;
//            }
//
//        }
//      return 0;
//
//
//
//               }
//
//}
