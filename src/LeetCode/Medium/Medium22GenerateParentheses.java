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

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public static List<String> generateParenthesis(int n) {
        n *= 2;
        List<String> array = new ArrayList<>();

        for(int i = (int) Math.pow(2, n) - 1; i >= 0; i-=2){
            int value = (int) Math.pow(2, n - 1);
            int remainder = i;
            StringBuilder sb = new StringBuilder();
            while(value > 0){
                if(remainder >= value){
                    sb.append(')');
                    remainder = i % value;
                }else{
                    sb.append('(');
                }
                value /= 2;
            }
            if(isValid(sb.toString())){
                array.add(sb.toString());
            }
        }
        return array;
    }

    public static void main(String[] args){
        List<String> list = generateParenthesis(3);
        System.out.println(list);
    }
}
