/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

        Example 1:

        Given nums = [1,1,2],

        Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

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

Thought process:

[0, 0, 0, 0, 6, 6, 7 ,7, 74]
    *
[0, 0, 0, 6, 6, 7, 7, 74, 0]
    *
[0, 1, 5, 6, 6, 7, 7, 74, 0]
          *
[0, 1, 5, 6, 6, 7, 7, 74, 0]
             *
[0, 1, 5, 6, 7, 7, 74, 0, 6]
                *
[0, 1, 5, 6, 7, 74, 0, 6, 7] -> Find imbalance Exit


Second approach: (Better!)
[0, 0, 0, 0, 6, 6, 7 ,7, 74]
    *
[0, 6, 0, 0, 0, 6, 7, 7, 74]
       *
[0, 6, 7, 0, 0, 6, 0, 7, 74]
          *
[0, 6, 7, 74, 0, 6, 0, 7, 0]

Handle repeaters:
[1, 1]
    *


       }*/
package ArraysTutorial;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int length = 1;
        /*for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                int j = i;
                while(j < nums.length - 1){
                    int hold = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = hold;
                    j++;
//
//                    if(j < nums.length && nums[j] > nums[j + 1]){
//                        break looper;
//                    }
                }
            }

        }*/


        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] > nums[i - 1]){
                        int hold = nums[i];
                        nums[i] = nums[j];
                        nums[j] = hold;
                        break;
                    }
                }
            }

            if(nums[i] >= nums[nums.length - 1]){
                System.out.println(Arrays.toString(nums));
                return i + 1;
            }
        }

        return 1;
    }

    public static void main(String args[]){
        int i  = removeDuplicates(new int[]{0, 0, 0, 0, 6, 8, 900});
        System.out.println(i);
    }
}

