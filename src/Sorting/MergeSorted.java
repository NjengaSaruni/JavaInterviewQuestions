/*
* Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]*/
package Sorting;

import java.util.Arrays;

public class MergeSorted {

    public static void merge(int[] nums1, int[] nums2){
       int i = nums1.length - 1;
       int left = nums1.length - nums2.length - 1;
       int right = nums2.length - 1;
       while(left >= 0 && right >= 0){
           if(nums1[left] >= nums2[right]){
               nums1[i] = nums1[left];
               left--;
           }else{
               nums1[i] = nums2[right];
               right--;
           }
           i--;
       }
    }

    public static void main(String[] args){
        int[] nums1 = new int[] {0};
        int[] nums2 = new int[] {1};

        merge(nums1, nums2);

        System.out.println(Arrays.toString(nums1));
     }
}
