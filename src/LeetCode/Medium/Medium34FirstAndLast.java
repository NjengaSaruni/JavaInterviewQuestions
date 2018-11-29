package LeetCode.Medium;

import java.util.Arrays;

public class Medium34FirstAndLast {
    public static int[] searchRange(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        int[] ans = new int[2];

        int index = -1;
        int mid;

        while(left <= right){
            mid = (left + right + 1) / 2;
            if(nums[mid] == target){
                index = mid;
                break;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        if(index == -1){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int i = index;
        while(i >= 0){
            if(nums[i] == target){
                ans[0] = i;
                i--;
            }else{
                ans[0] = i + 1;
                break;
            }
        }
        i = index;
        while(i < nums.length){
            if(nums[i] == target){
                ans[1] = i;
                i++;
            }else{
                ans[1] = i - 1;
                break;
            }
        }


        return ans;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(searchRange(new int[]{1,2,3,4,4,5}, 1)));
    }
}
