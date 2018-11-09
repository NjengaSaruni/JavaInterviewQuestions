package CrackingTheInterview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P11ReplaceSpaces {
    public static String replace(String str){
        int count = 0;
        for(char c: str.toCharArray()){
            if(c == ' ') count++;
        }
        char[] newStr = new char[str.length() + 2 * count];

        int i = newStr.length - 1;
        for(int j = str.length() - 1; j >= 0; j--){
            if(str.charAt(j) == ' '){
                newStr[i] = '0';
                newStr[i - 1] = '2';
                newStr[i - 2] = '%';
                i-=3;
            }else{
                newStr[i] = str.charAt(j);
                i--;
            }
        }
        System.out.println(Arrays.toString(newStr));
        return new String(newStr);
    }
    public static void main(String[] args){
        String str = "This is a string";

        System.out.println(replace(str));
    }
}
