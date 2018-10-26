/*
* [9, 1, 8, 3, 6, 2, 7, 4, 9, 5]
*
* []*/
package Sorting;

import java.util.*;
public class InsertionSort1 {
    public static void sort(int[] array){
        int i = 1;
        while(i < array.length){
            int toInsert = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] >= toInsert){
                array[j + 1] = array[j];
                j--;
            }
            j++;
            array[j] = toInsert;
            System.out.printf("j is %d\n", j);
            i++;
        }
    }
    public static void main(String[] args){
        int[] array = new int[]{0, 1, 8, 3, 6, 2, 7, 4, 9, 5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
