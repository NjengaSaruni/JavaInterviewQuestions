/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

        Note: For the purpose of this problem, we define empty string as valid palindrome.

        Example 1:

        Input: "A man, a plan, a canal: Panama"
        Output: true
        Example 2:

        Input: "race a car"
        Output: false

        Thought process:

        Out to middle, two finger algorithm.*/

package StringsTutorial;

public class ValidPalindrome{
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                right--;
                left++;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print(isPalindrome("I am ai"));
    }
}
