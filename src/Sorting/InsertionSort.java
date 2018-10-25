/*
 * Thought process
 *
 * [2,4,6,5,66,453,2,7,88,5]
 *
 * Step 1
 * i <- 1;
 *
 * while i < length(array)
 *       toInsert <- array[i]            int toInsert = array[1] = 15
 *                                       [17,15,7,3,66,453,2,7,88,5]
 *       j <- i - 1                      0
 *       while(j >= 0)
 *           if(array[j] >= toInsert])
 *               array[j + 1] = array[j]
 *           else
 *               j <- j + 1
 *               break
 *           j <- j - 1
 *
 *       array[j] <- toInsert
 *
 *       i <- i + 1
 *
 *
 *
 * */
package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));

        int i = 1;

        while(i < array.length){

            int toInsert = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] >= toInsert) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = toInsert;
            System.out.println(Arrays.toString(array));
            i++;
        }

    }

    public static void main(String[] args){
        int[] array = new int[]{17,15,711,13,66,453,2,7,88,5};
        sort(array);

        System.out.println(Arrays.toString(array));
    }
}
