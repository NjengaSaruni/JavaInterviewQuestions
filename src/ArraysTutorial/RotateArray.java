/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

        Example 1:

        Input: [1,2,3,4,5,6,7] and k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]
        Example 2:

        Input: [-1,-100,3,99] and k = 2
        Output: [3,99,-1,-100]
        Explanation:
        rotate 1 steps to the right: [99,-1,-100,3]
        rotate 2 steps to the right: [3,99,-1,-100]
        Note:

        Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
        Could you do it in-place with O(1) extra space?

        Thought Process:

         [1,4,5,6,7,7,7,8,10,12]

         [7,8,10,12,7,7,1,4,5,6]

         [7,8,10,12,1,4,5,6,7,7]


         [1,4,5,5,5] --> [5,5,1,4,5]

         [5,5,5,1,4]

         [5,5,4,1,5] --> (len(nms) - k) % 2 is 1 --> 



         For elements from len(array - 1) to len(array - n):
         hold = nums[len(array - n)]
         nums[array - n] = nums[0]
         nums[0] = hold;

*/

package ArraysTutorial;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        for(int i = nums.length -k, j = 0; i < nums.length; i++, j++){
            int hold = nums[i];
            nums[i] = nums[j];
            nums[j] = hold;
        }
        for(int i = k, j = nums.length -k; i < nums.length - 1; i ++, j++){
            int hold = nums[i];
            nums[i] = nums[j];
            nums[j] = hold;
        }

        System.out.print(Arrays.toString(nums));
    }

    public static void main(String[] args){
        rotate(new int[]{1,4,5,8,9}, 3);
    }
}
