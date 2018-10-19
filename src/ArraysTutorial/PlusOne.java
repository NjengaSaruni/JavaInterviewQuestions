/*Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

        You may assume the integer does not contain any leading zero, except the number 0 itself.

        Example 1:

        Input: [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Example 2:

        Input: [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.

        [1, 5, 6, 9, 9]

        [1, 5, 6, 0, 0]

        [
        Thought process:
        1. Add one to the number in the end of the array if the number is not 9 and return
        If number is 9 -> make number 0
            Check second last number -> add 1 and return if number is not 9



*/
package ArraysTutorial;

import java.util.Arrays;

public class PlusOne {
    private static int[] plusOne(int[] digits) {
        outer:
        for(int i = digits.length - 1; i >= 0; i--){
            while(digits[i] == 9){
                digits[i] = 0;
                continue outer;
            }
            if(i != 0){
                digits[i]++;
                return digits;
            }else if(digits[0] != 9) {
                digits[i]++;
                return digits;
            }
        }
        int answer[] = new int[digits.length + 1];
        answer[0] = 1;
        return answer;
    }
    public static void main(String[] args){
        System.out.print(
                Arrays.toString(plusOne(new int[]{1,9,8,9}))
        );
    }
}
