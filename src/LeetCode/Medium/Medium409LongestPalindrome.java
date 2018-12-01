//Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
//
//        This is case sensitive, for example "Aa" is not considered a palindrome here.
//
//        Note:
//        Assume the length of given string will not exceed 1,010.
//
//        Example:
//
//        Input:
//        "abccccdd"
//
//        Output:
//        7
//
//        Explanation:
//        One longest palindrome that can be built is "dccaccd", whose length is 7.
package LeetCode.Medium;

public class Medium409LongestPalindrome {
    public static int longestPalindrome(String s){
        int[] members = new int[128];
        boolean pivot = false;
        for(char c: s.toCharArray()) members[c] += 1;

        int ans = 0;
        for(int i = 65; i <= 122; i++){
            int quotient = members[i] / 2;
            ans += quotient * 2;

            if(members[i] % 2 > 0) pivot = true;
        }

        return pivot ? ans + 1: ans;
    }
    public static void main(String[] args){
        System.out.println(longestPalindrome("cccac"));
    }
}
