/*Given a 32-bit signed integer, reverse digits of an integer.

        Example 1:

        Input: 123
        Output: 321
        Example 2:

        Input: -123
        Output: -321
        Example 3:

        Input: 120
        Output: 21
        Note:
        Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

        Thought process:

        ((123 % 10 = 3) * 10) + ((12 % 10) * 10) + (1 % 10) */
package StringsTutorial;

import java.util.Map;

public class ReverseInteger {
    public static int reverse(int x) {
        int answer = 0;
        boolean isPositive = x > 0;
        if(!isPositive){
            x *= -1;
        }
        while(x > 0){
            try {
                answer = Math.multiplyExact(answer , 10);
                answer = Math.addExact( answer, x % 10);
            }catch (ArithmeticException ex){
                return 0;
            }
            x = x / 10;
        }
        if(!isPositive){
            return answer *-1;
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.print(reverse(90102312));
    }
}
