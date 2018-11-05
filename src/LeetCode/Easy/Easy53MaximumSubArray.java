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

import org.junit.*;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Easy53MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        try {
            int max = nums[0];
            for(int i = 0; i < nums.length;  i++){
                int value = nums[i];
                int currMax = value;

                for(int j = i + 1; j < nums.length; j++){
                    value = value + nums[j];
                    if(value > currMax){
                        currMax = value;
                    }
                }
                if(currMax > max) max = currMax;
            }
            return max;
        }catch (IndexOutOfBoundsException e){
            throw e;
        }
    }

    public static int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
            System.out.printf("Sum is %d,\t\tCurrent value is %d\t\tMax is %d\n", sum, nums[i], max);

        }
        return max;
    }

    public static void main(String[] args){
        int[] array = new int[] {-2,1,6,6,-10,-10,12,-1,-3};

//        System.out.println(maxSubArray(array));
        System.out.println(maxSubArray2(array));
    }
}


class TestMaxSubArray {

    @Test
    public void testMaxSubArray(){
        int[] array = new int[] {-2,1,6,6,-10,-10,12,-1,-3};

        TestCase.assertEquals(Easy53MaximumSubArray.maxSubArray(array), 13);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyArrayInput(){
        int[] array = new int[] {};

        Easy53MaximumSubArray.maxSubArray(array);
    }
}

class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestMaxSubArray.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}