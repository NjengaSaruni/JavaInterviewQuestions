/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Note that an empty string is also considered valid.

        Example 1:

        Input: "()"
        Output: true
        Example 2:

        Input: "()[]{}"
        Output: true
        Example 3:

        Input: "(]"
        Output: false
        Example 4:

        Input: "([)]"
        Output: false
        Example 5:

        Input: "{[]}"
        Output: true*/
package LeetCode.Easy;

import java.util.Stack;

public class Easy20ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.length() == 1) return false;

        for(Character c: s.toCharArray()){
            switch (c){
                case '[':
                    stack.push(c);
                    break;

                case '{':
                    stack.push(c);
                    break;

                case '(':
                    stack.push(c);
                    break;

                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') return false;
                    break;

                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                    break;

                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                    break;

                default:
                    return false;

            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        System.out.println(isValid("{[]}"));
    }

}
