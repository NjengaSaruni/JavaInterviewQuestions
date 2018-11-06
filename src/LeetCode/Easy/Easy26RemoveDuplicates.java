/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

        Example 1:

        Given nums = [1,1,2],

        Your function shoulds return length = 2, with the first two elements of nums being 1 and 2 respectively.

        It doesn't matter what you leave beyond the returned length.
        Example 2:

        Given nums = [0,0,1,1,1,2,2,3,3,4],

        Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

        It doesn't matter what values are set beyond the returned length.
        Clarification:

        Confused why the returned value is an integer but your answer is an array?

        Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

        Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
        int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
        print(nums[i]);
        }*/
package LeetCode.Easy;

import java.util.Arrays;

public class Easy26RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;

        // Loop will not be entered for empty and one item arrays
        while(fast < nums.length){
            // Increment fast counter if same value with previous
            if(nums[fast] == nums[fast-1]){
                fast++;
            }

            // Assign next unique value to next index of slow
            // Increment slow and keep searching
            else{
                nums[slow + 1] = nums[fast];
                slow++;
                fast++;
            }
        }

        // Length is index plus one (Safe for empty array)
        return slow + 1;
    }
    public static void main(String[] args){
        int[] array = new int[]{};
        System.out.println(removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }
}
