/*You are given an n x n 2D matrix representing an image.

        Rotate the image by 90 degrees (clockwise).

        Note:

        You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

        Example 1:

        Given input matrix =
        [
        [1,6,9],
        [4,5,2],
        [7,8,3]
        ],

        rotate the input matrix in-place such that it becomes:
        [
        [7,4,1],
        [8,5,2],
        [9,6,3]
        ]
        Example 2:

        Given input matrix =
        [
        [ 5, 1, 9,11],
        [ 2, 4, 8,10],
        [13, 3, 6, 7],
        [15,14,12,16]
        ],

        rotate the input matrix in-place such that it becomes:
        [
        [15,13, 2, 5],
        [14, 3, 4, 1],
        [12, 6, 8, 9],
        [16, 7,10,11]
        ]

        [13,  9,  5,  1],
        [14, 10,  6,  2],
        [15, 11,  7,  3],
        [16, 12,  8,  4]


        Thought process:
        [ 13, 9,  5,  1],
        [ 14, 10,  6,  2],
        [ 15, 11,  7,  3],
        [16, 12, 8,  4]

        [21, 16, 11,  6,  1]
        [22, 17, 12,  7,  2]
        [23, 18, 13,  8,  3]
        [25, 19, 14,  9,  4]
        [25, 20, 15, 10,  5]



        */
package ArraysTutorial;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

public class RotateImage {
    private static void recurse(int[][] array, int min, int max){
        int rowA = max;
        int colA = max;
        int rowB = min;
        int colB = max;

        int temp;

        while(rowA > min){
            temp = array[rowA][colA];
            array[rowA][colA] = array[rowB][colB];
            array[rowB][colB] = temp;
            rowA--;
            colB--;
        }

        while(colA > min){
            temp = array[rowA][colA];
            array[rowA][colA] = array[rowB][colB];
            array[rowB][colB] = temp;
            colA --;
            rowB ++;
        }

        while(rowA < max){
            temp = array[rowA][colA];
            array[rowA][colA] = array[rowB][colB];
            array[rowB][colB] = temp;
            rowA++;
            colB++;
        }

        max -= 1;
        min += 1;
        if(max > min){
            recurse(array, min, max);
        }

    }
    public static void rotateRecursive(int[][] matrix){
        recurse(matrix, 0, matrix[0].length - 1);
    }
    public static void rotate(int[][] matrix) {
        int size = matrix[0].length;

        int hold = matrix[0][size -1];
        matrix[0][size -1] = matrix[0][0];
        matrix[0][0] = hold;

        hold = matrix[0][0];
        matrix[0][0] = matrix[size -1][size - 1];
        matrix[size -1][size - 1] = hold;

        hold = matrix[0][0];
        matrix[0][0] = matrix[size -1][0];
        matrix[size -1][0] = hold;

        for(int y = 1; y <= size - 3; y++){
            for(int x = 1; x <= size - 3; x++){
                hold = matrix[0][y];
                matrix[0][y] = matrix[x][size - 1];
                matrix[x][size - 1] = hold;
            }
        }

        for(int x = 1; x <= size - 3; x++){
            for(int y
                = 1; y <= size - 3; y++){
                hold = matrix[x][0];
                matrix[x][0] = matrix[0][y];
                matrix[0][y] = hold;
            }
        }

        for(int x = 1; x <= size - 3; x++){
            for(int y = 1; y <= size - 3; y++){
                hold = matrix[x][0];
                matrix[x][0] = matrix[0][y];
                matrix[0][y] = hold;
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9, 10, 11, 12}, {13,14,15,16}};
        rotateRecursive(matrix);
        for(int[] array: matrix){
            System.out.println(Arrays.toString(array));

        }
    }
}
