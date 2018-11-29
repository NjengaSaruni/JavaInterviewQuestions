package LeetCode.Medium;

import java.util.*;
import java.util.stream.Collectors;

public class Medium39CombinationSum {
    public static  List<List<Integer>> combinationSum(int[] candidates, int target){
        Set<List<Integer>> intSet = new HashSet<>();
        Set<Integer> values = Arrays.stream(candidates).boxed().collect(Collectors.toSet());

        return null;
     }
    public static void main(String[] args){

    }
}
