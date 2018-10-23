/*
 * Thought process:
 *
 *
 *
 *  [0, 0, 0, 0, 0]
    [0, 0, 0, 0, 0]
    [0, 0, 1, 0, 0]
    [0, 0, 0, 0, 0]
    [0, 0, 0, 0, 9]
 * */
package ArraysTutorial;

import java.util.Arrays;

public class SpiralMatrix {
    public static int[][] spiral(int order){
        int[][] matrix = new int[order][order];
        int center = order / 2;

        int value = 1;

        int row = center;
        int col = center;

        int right = center + 1;
        int up = center - 1;
        int left = center - 1;
        int down = center + 1;

        matrix[row][col]= value;

        while(right < order){
            // Step right
            value += 1;
            col++;
            matrix[row][col] = value;

            // Step up
            while(row > up){
                row--;
                value ++;
                matrix[row][col] = value;
            }

            // Step left
            while(col > left){
                col--;
                value++;
                matrix[row][col] = value;

            }

            // Step down
            while(row < down){
                row++;
                value++;
                matrix[row][col] = value;

            }

            // Step riiiight
            while(col < right){
                col++;
                value++;
                matrix[row][col] = value;
            }
            right++;
            down++;
            up--;
            left--;
        }
        return matrix;
    }
    public static void main(String[] args){
        for(int[] array: spiral(5)){
            System.out.println(Arrays.toString(array));
        }
    }
}
