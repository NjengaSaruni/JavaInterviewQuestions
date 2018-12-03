//Given a collection of numbers that might contain duplicates, return all possible unique permutations.
//
//        Example:
//
//        Input: [1,1,2]
//        Output:
//        [
//        [1,1,2],
//        [1,2,1],
//        [2,1,1]
//        ]
package LeetCode.Medium;

import java.util.*;

public class Medium47PermutaionsII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        backTrack(list, nums, 0, new ArrayList<>());

        return list;
    }

    public static void backTrack(List<List<Integer>> list, int[] nums, int start, List<Integer> former){
        if(former.size() == nums.length){
            list.add(new ArrayList<>(former));
        }else {
            for(int i = start; i < nums.length; i++){
                former.add(nums[i]);
                backTrack(list, nums, start + 1, former);
                former.remove(former.size() - 1);
            }
        }

    }
    public static void main(String[] args){
        for(List<Integer> list: permuteUnique(new int[]{1,1,2})){
            System.out.println(list);
        }
    }
}
