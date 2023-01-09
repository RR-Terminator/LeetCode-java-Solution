public class LeetCode_Problem_520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG"));
    }
    // Time Complexity O(n):
    public static boolean detectCapitalUse(String word) {
     int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >='A' && word.charAt(i)<='Z') {
                count++;
            }
        }
        return count == word.length() || count == 0 || (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && count == 1);
    }

    // Time Complexity O(n): [Regex]
//    public static boolean detectCapitalUse(String word){
//        return word.matches("[A-Z]*|.[a-z]*");
//    }


}
