//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//        Note:
//
//        The solution set must not contain duplicate triplets.
//
//        Example:
//
//        Given array nums = [-1, 0, 1, 2, -1, -4],
//
//        A solution set is:
//        [
//        [-1, 0, 1],
//        [-1, -1, 2]
//        ]
package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Medium11ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, Integer[]> map = new HashMap<>();

        Integer[] tempArray;

        for(int i: nums){
            if(map.containsKey(i)){
                tempArray = new Integer[]{0 - i, map.get(i)[1] + 1};
            }else{
                tempArray = new Integer[]{0 - i, 0};
            }
            map.put(i, tempArray);
        }
        for(int i = 0; i < nums.length - 1; i++){
            int sumOfComplements = map.get(nums[i])[0] + map.get(nums[i+1])[0];
            if(map.containsKey(sumOfComplements)){
                if(map.get(nums[i])[1] >= 1){
                    if(map.containsKey(0 - (map.get(nums[i])[0])));
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[i]);
                    ls.add(0 - (nums[i] + nums[i]));
                    list.add(ls);

                    tempArray = new Integer[]{nums[i], -1};
                    map.put(nums[i], tempArray);

                    tempArray = new Integer[]{0 - (nums[i] + nums[i]), -1};
                    map.put(nums[i], tempArray);
                }else if(map.get(nums[i])[1] > -1 || map.get(nums[i + 1])[1] > -1){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[i + 1]);
                    ls.add(0 - (nums[i] + nums[i + 1]));
                    list.add(ls);

                    tempArray = new Integer[]{nums[i], -1};
                    map.put(nums[i], tempArray);

                    tempArray = new Integer[]{nums[i + 1], -1};
                    map.put(nums[i + 1], tempArray);

                    tempArray = new Integer[]{0 - (nums[i] + nums[i + 1]), -1};
                    map.put(0 - (nums[i] + nums[i + 1]), tempArray);
                }

            }
        }
        return list;
    }
    public static void main(String[] args){
        System.out.println(threeSum(new int[]{-1, 0, 1, -2, -3, -1, 2}));
    }
}
