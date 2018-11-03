//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//        Example:
//
//        Input: [-2,1,-3,4,-1,2,1,-5,4],
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
//        Follow up:
//
//        If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class Easy53MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        Map<Integer, Integer[]> map = new HashMap<>();
        for(int i = 0; i < nums.length;  i++){
            map.put(i, new Integer[]{i, nums[i]});
            int value = nums[i];
            int j = i + 1;
            while(j < nums.length){
                int total = value + nums[j];
                if(value < total){
                    map.put(i, new Integer[]{j, total});
                }
            }
          }
        }
    }

    public static void main(String[] args){
        int[] array = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(array));
    }
}
