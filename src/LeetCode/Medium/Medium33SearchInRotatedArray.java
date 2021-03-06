//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
//        (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
//
//        You are given a target value to search. If found in the array return its index, otherwise return -1.
//
//        You may assume no duplicate exists in the array.
//
//        Your algorithm's runtime complexity must be in the order of O(log n).
//
//        Example 1:
//
//        Input: nums = [4,5,6,7,0,1,2], target = 0
//        Output: 4
//        Example 2:
//
//        Input: nums = [4,5,6,7,0,1,2], target = 3
//        Output: -1
package LeetCode.Medium;

public class Medium33SearchInRotatedArray {
    public static int search(int[] nums, int target, int left, int right) {
        if(left >= right){
            if(nums[right] == target){
                return right;
            }
            return -1;
        }

        int mid = (left + right + 1) / 2;
        if(nums[mid] == target){
            return mid;
        }
        else if(target > nums[mid]){
            if(target >= nums[left]) {
                if (mid == left) {
                    return search(nums, target, mid + 1, right);
                } else {
                    return search(nums, target, left, mid - 1);
                }
            }
            return search(nums, target, mid + 1, right);
        }
        if(target >= nums[left]) {
            if(mid == right){
                return search(nums, target, mid + 1, right);
            }
            return search(nums, target, left, mid - 1);
        }
        return search(nums, target, mid + 1, right);
    }
    public static int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    public static void main(String[] args){
        int[] array = new int[]{13,14,19,1,2,4,5,6,8};

        System.out.println(search(array, 13));
    }
}
