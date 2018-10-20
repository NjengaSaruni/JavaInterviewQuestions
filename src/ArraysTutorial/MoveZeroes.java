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


        [0, 3, 8, 9, 0, 5, 6, 0, 8, 0]

        [3, 0, 8, 9, 0, 5, 6, 0, 8, 0]

        [3, 8, 0, 9, 0, 5, 6, 0, 8, 0]

        [3, 8, 9, 0, 0, 5, 6, 0, 8, 0]


        [0, 3, 8, 9, 0, 5, 6, 0, 8, 0]

        [0, 3, 8, 9, 0, 5, 6, 0, 8, 0]

        [0, 3, 8, 9, 0, 5, 6, 8, 0, 0]

        [3, 8, 9, 5, 6, 8, 0, 0, 0, 0]







    public static void main(String[] args){
       moveZeroes(new int[]{0, 3, 5, 6, 0, 8});
    }

                *
        [12, 1, 3, 0, 0]


        */

package ArraysTutorial;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int currentEnd = nums.length - 1;

        for(int i = 0; i < nums.length - 1; i ++){
            if(nums[i] == 0){
                for(int j = i; j < currentEnd; j ++){
                    int hold = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = hold;
                }
                currentEnd--;
            }
        }

        System.out.print(Arrays.toString(nums));
    }



    public static void moveZeroesPablo(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i --){
            if(nums[i] == 0){
                if(i < nums.length - 1){
                    int j = i;
                    while(j < nums.length - 1){
                        if(nums[j + 1] == 0){
                            break;
                        }
                        int hold = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = hold;
                        j++;
                    }
                }

            }
        }

        System.out.print(Arrays.toString(nums));
    }

    public static void main(String[] args){
       moveZeroesPablo(new int[]{0, 0, 1});
//       moveZeroes(new int[]{0,1,0,3,12});
    }
}