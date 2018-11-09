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

    public static void removeDuplicates1(char[] str){
        int[] available = new int[256];

        int fast = 1;
        int slow = 0;
        available[str[0]] = 1;
        while(fast < str.length){
            if(available[str[fast]] == 0){
                slow++;
                str[slow] = str[fast];
                available[str[slow]] = 1;
            }
            fast++;
        }

    }


    public static void main(String[] args){
        char[] str = new char[] {'1', '4' ,'4', 'a', 'b', '5', 'a', 'q', '4'};
        removeDuplicates1(str);
        System.out.println(str);
    }
}
