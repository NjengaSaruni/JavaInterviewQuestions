package CrackingTheInterview;

import java.util.HashSet;
import java.util.Set;

public class P7RemoveDuplicates {
    public static void removeDuplicates(char[] str){
        if(str.length == 0){
            return;
        }
        Set<Character> set = new HashSet<>();
        int fast = 1;
        int slow = 0;
        set.add(str[0]);
        while(fast < str.length){
            if(!set.contains(str[fast])){
                slow++;
                str[slow] = str[fast];
                set.add(str[slow]);
            }
            fast++;
        }
    }

    public static void main(String[] args){
        char[] str = new char[] {};
        removeDuplicates(str);
        System.out.println(str);
    }
}
