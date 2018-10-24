package Sorting;

import java.util.Arrays;

public class SelectionSort {
    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if(min > i){
                int hold = array[i];
                array[i] = array[min];
                array[min] = hold;
                System.out.println(Arrays.toString(array));
            }
        }

    }
    public static void main(String[] args){
        int[] array = new int[] {1,19,13,18,1,3,5,1,33};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}

