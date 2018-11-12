package CrackingTheInterview;

import java.util.Arrays;

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
        for(char[] a: intermediate){
            System.out.println(Arrays.toString(a));
        }
        int row = 0;
        int originalIndex = index;
        for(int i = 0; i < intermediate.length; i++){
            while(row < (intermediate[i].length + 1) * (i + 1)){
                int col = intermediate[i].length;
                int interCounter = intermediate[i].length - 1;
                while(col >= 0){
                    if(col == index){
                        array[row][col] = str[originalIndex];
                    }else{
                        array[row][col] = intermediate[i][interCounter];
                        interCounter--;
                    }
                    col--;
                }
                index--;
                row++;
            }
            index = originalIndex;
        }

        return array;

    }

    public static void main(String[] args){
        char[] arr = new char[]{'a', 'b', 'c', 'd'};
        for(char[] array: permutations(arr, arr.length - 1)){
            System.out.println(Arrays.toString(array));
        }
    }
}
