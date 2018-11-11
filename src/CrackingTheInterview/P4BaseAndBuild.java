package CrackingTheInterview;

import java.util.Arrays;
import java.util.List;

public class P4BaseAndBuild {
    public static int factorial(int i){
        if(i <= 1){
            return 1;
        }else{
            return i * factorial( i - 1);
        }
    }
    public static char[][] permutations(char[] str, int index){
        int rows = factorial(index + 1);
        char[][] array = new char[rows][index + 1];

        if(index == 0){
            array[0][0] = str[0];
            return array;
        }

        char[][] intermediate = permutations(str, index - 1);
        int row = 0;
        for(int i = 0; i < intermediate.length; i++){
            while(row < (intermediate[i].length + 1) * (i + 1)){
                for(int j = index; j > 0; j--){

                }
            }
        }

        return array;

    }

    public static void main(String[] args){
        char[] arr = new char[]{'a', 'b', 'c'};
        for(char[] array: permutations(arr, arr.length - 1)){
            System.out.println(Arrays.toString(array));
        }
    }
}
