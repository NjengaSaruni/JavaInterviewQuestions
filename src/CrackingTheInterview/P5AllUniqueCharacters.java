package CrackingTheInterview;

import java.util.Arrays;

public class P5AllUniqueCharacters {
    public static boolean allUnique(String str){
        char[] strchars = str.toCharArray();
        Arrays.sort(strchars);

        for(int i = 0; i < strchars.length - 1; i++){
            if(strchars[i] == strchars[i+1]) return false;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(allUnique(""));
    }
}
