package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int i = 1; i < array.length; i++){
            int toInsert = array[i];
            System.out.printf("Iteration %d to insert %d\n", i, toInsert);
            int j = i - 1;
            while(j >= 0 && array[j] > toInsert){
                System.out.printf("Shift %d from %d to %d -> \t\t", array[j], j , j+ 1);
                array[j + 1] = array[j];
                System.out.printf("%s\t\t",Arrays.toString(array));
                System.out.printf("Carry value is %d\n", toInsert);

                if(j > 0){
                    j--;
                }
                else{
                    break;
                }
            }
            if( j < i - 1){
                System.out.printf("Finally insert %d in hole %d\t\t", toInsert, j);
                array[j] = toInsert;
            }else{
                System.out.printf("No insertion necessary\t\t\t");
            }

            System.out.printf("%s\n\n", Arrays.toString(array));

        }
    }

    public static void main(String[] args){
        int[] array = new int[]{17,15,7,3,66,453,2,7,88,5};
        sort(array);

        System.out.println(Arrays.toString(array));
    }
}
