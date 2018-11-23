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
        List<List<Character>> array =  new ArrayList<>();
        if(index == str.length() - 1){
            List<Character> base = new ArrayList<Character>();
            base.add(str.charAt(index));
            array.add(base);
        }else {
            List<List<Character>> base = permutations(str, index - 1);
            List<List<Character>> newbase = permutations(str, index - 1);
            for(List<Character> characters: base){
                for(int i = 0; i < characters.size(); i++){
                    
                }
            }      
        }
        return array;
    }
    public static List<List<Character>> permutations(String str){
        List<List<Character>> list = new ArrayList<List<Character>>();

        return permutations(str, str.length() - 1);
    }
    public void nextPermutation(int[] nums) {

    }

    public static void main(String[] args){
        String str = "1234";
        for(List a: permutations(str)){
            System.out.println(a);
        }
    }
}
