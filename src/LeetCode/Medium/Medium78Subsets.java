package LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium78Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Sort
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private  static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsIterative(int[] nums){
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++){
            int j;
            j = i;
            List<Integer> list = new ArrayList<>();

            while(j < nums.length){
                list.add(nums[j]);
                List<Integer> subset = new ArrayList<>(list);
                answer.add(subset);

                int m = j;
                while(m - i >= 2){
                    subset = new ArrayList<>(list);
                    subset.remove(m - i - 1);
                    answer.add(subset);
                    m--;
                    if(m - i == 1){
                        subset = new ArrayList<>(list);
                        subset.remove(m - i - 1);
                        answer.add(subset);
                    }
                }
                j++;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        for(List<Integer> ls: subsets(new int[]{1,2,3,4})){
            System.out.println(ls);
        }
    }
}
