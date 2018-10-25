/*
* [7,4,5,3,2,7,6]
*
* [7,4,5,3,2,6,7]
* */


package Sorting;

import java.util.*;

public class QuickSort {
    private static void sort(int[] array, int left, int right){
        System.out.printf("%s\n", Arrays.toString(array));
        if(left >= right){
            return;
        }
        int pivot = array[right];
        int pIndex = left;
        int buffer;
        int rememberLeft = left;
        while(left < right){
            if(array[left] <= pivot){
                buffer = array[left];
                array[left] = array[pIndex];
                array[pIndex] = buffer;
                pIndex++;
            }
            left++;
        }

        buffer = array[pIndex];
        array[pIndex] = pivot;
        array[right] = buffer;

        sort(array, rememberLeft, pIndex - 1);
        sort(array, pIndex + 1, right);

    }

    public static void main(String[] args){
        int[] array = new int[]{8,4,3,5,1,2,0,3};
        sort(array, 0, array.length -  1);
        System.out.println(Arrays.toString(array));
    }

}
