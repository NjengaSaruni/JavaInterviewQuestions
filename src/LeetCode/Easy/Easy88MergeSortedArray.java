/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]*/
package LeetCode.Easy;

import java.util.Arrays;

public class Easy88MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        m--;
        n--;
        while( i >= 0){
            System.out.println(i);
            if(m >= 0 && n >= 0 && nums1[m] >= nums2[n]){
                nums1[i] = nums1[m];
                m--;
            }else if(m >= 0 && n >= 0 && nums1[m] < nums2[n]){
                nums1[i] = nums2[n];
                n--;
            }else if(m >= 0){
                nums1[i] = nums1[m];
                m--;
            }else{
                nums1[i] = nums2[n];
                n--;
            }
            i--;
        }
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        merge(nums1, 0 ,nums2, 1);

        System.out.println(Arrays.toString(nums1));
    }
}

class TestMergeSort {
    public static void main (String[] args){

    }
}
