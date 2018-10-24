package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] array){
        int[] answer = new int[array.length];
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int hold = array[i];
            array[i] = array[minIndex];
            array[minIndex] = hold;

            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{1,5,7,3,66,3,2,7,88,5};
        sort(array);

        System.out.println(Arrays.toString(array));
    }
}
