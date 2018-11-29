//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//        For example, given n = 3, a solution set is:
//
//        [
//        "((()))",
//        "(()())",
//        "(())()",
//        "()(())",
//        "()()()"
//        ]


package LeetCode.Medium;

import java.util.*;

public class Medium22GenerateParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(stack.isEmpty()) return false;
            else if(stack.peek() == '('){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static Set<String> generateParenthesis(int n) {
        n *= 2;
        Set<String> array = new HashSet<>();

        for(int i = (int) Math.pow(2, n); i >= (int) Math.pow(2, n - 1); i-=2){
            int value = (int) Math.pow(2, n - 1);
            int remainder = i;
            int numA = 0;
            int numB = 0;
            StringBuilder sb = new StringBuilder();
            while(value > 0){
                if(remainder >= value && numA < n / 2){
                    sb.append('(');
                    numA++;
                    remainder = i % value;
                }else if(numB < numA){
                    sb.append(')');
                    numB++;
                }else{
                    break;
                }
                value /= 2;
            }
            if(sb.toString().length() == n && !array.contains(sb.toString())){
                array.add(sb.toString());
            }

        }
        return array;
    }

    public static void main(String[] args){
        Set<String> list = generateParenthesis(1);
        System.out.println(list);
    }
}
