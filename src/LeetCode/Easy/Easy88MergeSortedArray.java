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
        outer:
        while(m >= 0 || n >= 0){
            if(m < 0){
                while(n >= 0) {
                    nums1[i] = nums2[n];
                    n--;
                }
                break;
            }else if(n < 0){
                while(m >= 0){
                    nums1[i] = nums1[m];
                    m--;
                }
                break;
            }
            if(nums1[m] >= nums2[n]){
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
        int[] nums1 = new int[]{0, 2, 3, 4};
        int[] nums2 = new int[]{1, 2, 6};

        merge(nums1, 0 ,nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }
}
