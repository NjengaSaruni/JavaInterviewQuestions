package LeetCode.Easy;

public class Easy409LongestPalindrome {
    public static String longestPalindrome(String str){
        StringBuilder longest = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            int left = i;
            int right = i + 1;
            if(left >= 0 && right < str.length() - 1){
                if(longest.length() < 2){
                    if(str.charAt(left) == str.charAt(right)){
                        longest.setLength(0);
                        longest.append(str.charAt(left)).append(str.charAt(i));
                    }
                }else {
                    if (str.charAt(left) == str.charAt(right)) {
                        longest.setLength(0);
                        longest.append(str.charAt(left)).append(str.charAt(i));
                    }
                }

            }
        }
        System.out.println(longest);
        return str;
    }
    public static void main(String[] args){
        System.out.println(longestPalindrome("aacbcde"));
    }
}
