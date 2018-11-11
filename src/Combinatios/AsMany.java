/*Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

        Example:

        Input: n = 4, k = 2
        Output:
        [
        [2,4],
        [3,4],
        [2,3],
        [1,2],
        [1,3],
        [1,4],
        ]

      n = 1; k = 1

      [1]

      n = 2; k = 1

      []

      Thought process: recursion

      */

package Combinatios;

import java.util.Arrays;
public class AsMany {
    public static int factorial(int n){
        return 0;
    }
    public static int[][] combine(int n, int k) {
        int[][] answer;
        if(k == 1){
            answer = new int[n][0];
        }
        else {
            answer = new int[n][k];
        }
        return answer;
    }

    public static void main(String[] args){
        for(int[] arr: combine(4, 2)){
            System.out.println(Arrays.toString(arr));
        }
    }
}