/*Given an array of integers, find if the array contains any duplicates.

        Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

        Example 1:

        Input: [1,2,3,1]
        Output: true
        Example 2:

        Input: [1,2,3,4]
        Output: false
        Example 3:

        Input: [1,1,1,3,3,4,3,2,4,2]
        Output: true

        Thought process:
        1: Use sets, if length changes return true. Else false



*/
package ArraysTutorial;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            set.add(i);
        }

        return (set.size() != nums.length);
    }

    public static void main(String[] args){
       System.out.println(containsDuplicate(new int[]{1,2,3,3}));
    }
}
