/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Example:

        Input: [0,1,0,3,12]
        Output: [1,3,12,0,0]
        Note:

        You must do this in-place without making a copy of the array.
        Minimize the total number of operations.

        map: 12 : [4]
              3:  [2]

        Thought process:

        [0,  1, 0, 3, 12]
         *
        [1,  0, 3, 12, 0]
             *
        [12, 1, 0, 3, 0]
                *
        [12, 1, 3, 0, 0]


        */

package ArraysTutorial;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length - 1; i ++){
            if(nums[i] == 0){
                for(int j = i; j < nums.length - 1; j++){
                    int hold = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = hold;
                }
            }
        }

        System.out.print(Arrays.toString(nums));
    }

    public static void main(String[] args){
       moveZeroes(new int[]{0, 3, 5, 6, 0, 8});
    }
}
