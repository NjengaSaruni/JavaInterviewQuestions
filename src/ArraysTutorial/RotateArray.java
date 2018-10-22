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


         [1, 2, 3, 4, 5] -> 2

         [4, 5, 3, 1, 2]

         [1, 2, 3, 4, 5, 6] -> 2

         [5, 6, 3, 4, 1, 2]

         [5, 6, 1, 4, 3, 2]

         [1, 2, 3, 4, 5, 6, 7, 8, 9] -> 3

         [7, 8, 9, 4, 5, 6, 1, 2, 3]

         [8, 9, 10, 1, 2, 3, 7, 4, 5, 6] ->
                             l        r -> nums.len - k



         [1, 2, 3, 4, 5, 6, 7, 8] -> 3

         [6, 7, 8, 1, 2, 3, 5, 4]

         [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1]

         [8, 9, 10, 1, 2, 3, 6, 4, 5, 7]


         left = k;
         right = nums.length - k

         while right < nums.length


         [1, 2, 3, 4, 5] -> 2

         [4, 5, 1, 3, 2]

         [1 ,2 ,3, 4, 5, 6] -> 2

         [5, 6, 1, 2, 3, 4]

         [4, 5, 3, 1, 2]
         nums.length            -> 5
         k                      -> 2
         nums.length - k        -> 5 - 2 = 3

         [4, 5, 1, 2, 3]

         right -> 3 -> 4
         left  -> 2 -> 3




*/

package ArraysTutorial;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int hold;
        for(int i = nums.length -k, j = 0; j < k; i++, j++){
            hold = nums[i];
            nums[i] = nums[j];
            nums[j] = hold;
        }
        int left = k;
        for(int right = nums.length - k; right < nums.length; right++){
            hold = nums[left];
            nums[left] = nums[right];
            nums[right] = hold;
            left++;
        }
        while(left < nums.length - k && nums.length > 1){
            for(int right = nums.length - k; right < nums.length; right++){
                hold = nums[left];
                nums[left] = nums[right];
                nums[right] = hold;
                left++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }

    public static void main(String[] args){
        rotate(new int[]{1}, 5);
    }
}
