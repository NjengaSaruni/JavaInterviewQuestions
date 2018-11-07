package CrackingTheInterview;

import java.util.ArrayList;
import java.util.List;

public class P4BaseAndBuild {
    public static List<String> permutations(String str){
        List<String> ls = new ArrayList<>();
        char[] strchars = str.toCharArray();

        if(strchars.length == 0){
            return ls;
        }
        if(strchars.length == 1){
            ls.add(str);
            return ls;
        }

    }

    public static void main(String[] args){

    }
}
