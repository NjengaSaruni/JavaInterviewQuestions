/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

        Example 1:

        Input: 121
        Output: true
        Example 2:

        Input: -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        Follow up:

        Coud you solve it without converting the integer to a string?

        */
package LeetCode.Easy;

public class Easy9PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int invert = 0;
        int originalX = x;

        while(x > 0){
            invert = invert * 10 + x % 10;
            x /= 10;
        }
        return originalX == invert;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(0));
    }
}
