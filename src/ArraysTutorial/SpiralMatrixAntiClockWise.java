package ArraysTutorial;


import java.util.Arrays;

public class SpiralMatrixAntiClockWise {
    public static int[][] spiral(int n){
        int[][] matrix = new int[n][n];
        int mid = n / 2;

        int max = mid + 1;
        int min = mid - 1;

        int value = 1;
        int row, col;
        row = col = mid;

        matrix[row][col] = value;

        while(max < n){
            while(col < max){
                col++; value++;
                matrix[row][col] = value;
            }

            while(row < max){
                row++; value++;
                matrix[row][col] = value;
            }

            while(col > min){
                col--; value++;
                matrix[row][col] = value;
            }

            while (row > min){
                row--; value++;
                matrix[row][col] = value;
            }

            while(col < max){
                col++; value++;
                matrix[row][col] = value;
            }

            max++;
            min--;
        }

        return matrix;

    }
    public static void main(String[] args){
        for(int[] array: spiral(5)){
           System.out.println(Arrays.toString(array));
        }
    }
}
