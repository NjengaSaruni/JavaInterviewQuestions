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

import java.util.ArrayList;
import java.util.List;
public class AsMany {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        for(int i = 1; i <= n - 1;  i++){

        }

        return answer;
    }

    public static void main(String[] args){
        for(List<Integer> arr: combine(4, 2)){
            System.out.println(arr);
        }
    }
}