import java.util.ArrayList;
import java.util.List;

public class LeetCode_Problem_17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("1"));
    }

    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            List <String> ls = new ArrayList<>();
            return ls;
        }
        else {
            int n=Integer.parseInt(digits);
            return keypad(n);
        }
    }

    public static List<String> keypad(int n){

        if(n==0 || n==1){
            List <String> ls = new ArrayList<>();
            ls.add("");
            return ls;
        }
        int smallint = n%10;
        List <String> ans = keypad(n/10);
        String smallans = helper(smallint);
        List <String> ls = new ArrayList<>();

        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < smallans.length(); j++) {
                ls.add(ans.get(i)+smallans.charAt(j));
            }
        }
        return ls;







    }
    private static String helper(int newN){
        if(newN==2)
            return "abc";
        if(newN==3)
            return "def";
        if(newN==4)
            return "ghi";
        if(newN==5)
            return "jkl";
        if(newN==6)
            return "mno";
        if(newN==7)
            return "pqrs";
        if(newN==8)
            return "tuv";
        if(newN==9)
            return "wxyz";
        else
            return "";
    }


}
