/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:

        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].

        7 -> 0
        2 -> 1
        -2 -> 2
        -6 -> 3


        */
package ArraysTutorial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void printMap(Map<Integer, Integer> map){
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]), i};
            }else{
                map.put(complement, i);
            }
        }

        return new int[] {0, 0};
    }

    public static void main(String[] args){
        System.out.print(Arrays.toString(twoSum(new int[] {2, 7, 8, 12, 34}, 36)));
    }
}
