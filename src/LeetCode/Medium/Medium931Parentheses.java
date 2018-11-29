package LeetCode.Medium;

import java.util.Stack;

public class Medium931Parentheses {
    public static int parentheses(String string){
        int openCount = 0;
        int answer = 0;
        for(Character c: string.toCharArray()){
            if(c == ')'){
                if(openCount == 0){
                    answer++;
                }else{
                    openCount -= 1;
                }
            }else{
                openCount++;
            }
        }

        return answer + openCount;
    }


    public static void main(String[] args){
        System.out.println(parentheses(")((()()("));
    }
}
