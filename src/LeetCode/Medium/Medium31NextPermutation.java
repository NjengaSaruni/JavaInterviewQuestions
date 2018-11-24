//31. Next Permutation
//        Medium
//        1201
//        337
//
//
//        Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//
//        If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
//
//        The replacement must be in-place and use only constant extra memory.
//
//        Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
//
//        1,2,3 → 1,3,2
//        3,2,1 → 1,2,3
//        1,1,5 → 1,5,1
package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class Medium31NextPermutation {
    public static List<List<Character>> permutations(String str, int index){
        List<List<Character>> oldArray =  new ArrayList<>();
        if(index <= 0) {
            List<Character> base = new ArrayList<>();
            base.add(str.charAt(index));
            oldArray.add(base);
            return oldArray;
        }
        oldArray = permutations(str, index - 1);

        List<List<Character>> newArray = new ArrayList<>();

        for(List<Character> oldRow: oldArray){
            int size = oldRow.size();
            int newRowPointer = size;
            for(int i = 0; i < factorial(oldRow.size() + 1) / oldRow.size(); i++){
                List<Character> newRow = new ArrayList<>();
                int oldRowIndex = 0;
                for(int newRowIndex = 0; newRowIndex <= size; newRowIndex++){
                    if(newRowIndex == newRowPointer){
                        newRow.add(str.charAt(index));
                    }else{
                        newRow.add(oldRow.get(oldRowIndex));
                        oldRowIndex++;
                    }
                }
                newArray.add(newRow);
                newRowPointer--;
            }
       }
        return newArray;
    }

    public static int factorial(int i){
        if(i == 1) return 1;
        return i * factorial(i - 1);
    }
    public static List<List<Character>> permutations(String str){
        return permutations(str, str.length() - 1);
    }
    public void nextPermutation(int[] nums) {

    }

    public static void main(String[] args){
        String str = "";
        List<List<Character>> list =  permutations(str);
        for(List a: list){
            System.out.println(a);
        }
    }
}
