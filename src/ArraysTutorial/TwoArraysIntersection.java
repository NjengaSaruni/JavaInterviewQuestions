/*
Given two arrays, write a function to compute their intersection.

        Example 1:

        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2,2]
        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
        Note:

        Each element in the result should appear as many times as it shows in both arrays.
        The result can be in any order.
        Follow up:

        What if the given array is already sorted? How would you optimize your algorithm?
        What if nums1's size is small compared to nums2's size? Which algorithm is better?
        What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once


        Thought process:

        map - 4: 0
              9: 0
              5: 1

              Next: 9 ->
                    8 ->

              [9, 4]
    */
package ArraysTutorial;

import java.util.*;

public class TwoArraysIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums1){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else {
                map.put(num, 1);
            }
        }
        for(int num: nums2){
            if(map.containsKey(num)){
                if(map.get(num) > 0){
                    answer.add(num);
                    map.put(num, map.get(num) - 1);
                }
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();

    }
    public static void main(String[] args){
        System.out.print(Arrays.toString(
                intersect(new int[] {1, 2, 3, 3}, new int[] {3, 6, 3, 4, 1, 5}))
        );
    }
}

