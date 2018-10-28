/*
* 5,3,2,2,4,2
* 3,5*/
package Sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array){
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
        TestBubble.main(new String[] {""});
    }
}


class TestBubble {

    @Test
    public static void main(String[] args){
        Arrays.bina
        int[][] array = new int[][]{new int[]{1,3,4},new int[]{1,3,2}};
//        BubbleSort.sort(array);
        Assert.assertArrayEquals(array, new int[][]{new int[]{1,3,4},new int[]{1,3,2}});
    }
}