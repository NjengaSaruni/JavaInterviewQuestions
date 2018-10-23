/*
* 5,3,2,2,4,2
* 3,5*/
package Sorting;

import java.util.Arrays;

public class BubbleSort {
    private static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    int hold = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = hold;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] array = new int[]{1,4,3,5,2,5,6,3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
