//Given a string s, partition s such that every substring of the partition is a palindrome.
//
//        Return all possible palindrome partitioning of s.
//
//        Example:
//
//        Input: "aab"
//        Output:
//        [
//        ["aa","b"],
//        ["a","a","b"]
//        ]
//
        package LeetCode.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Medium131PalindromePartitioning {

    public static List<List<String>> partition(String s) {
        Set<List<String>> set = new HashSet<>();

        for(int i = 1; i < s.length(); i++){
            String A = s.substring(0, i);
            String B = s.substring(i);

            if(isPalindrome(A) && isPalindrome(B)){
                List<String> partitions = new ArrayList<>();
                partitions.add(A);
                partitions.add(B);

                if(!set.contains(partitions)){
                    set.add(partitions);
                }

                List<List<String>> subA = partition(A);
                List<List<String>> subB = partition(B);

                addToSet(set, B, subA);
                addToSet(set, A, subB);
            }
        }

        List<List<String>> answer = new ArrayList<>();
        answer.addAll(set);

        return answer;
    }

    private static void addToSet(Set<List<String>> set, String a, List<List<String>> subB) {
        if(subB.size() > 0){
            for(List<String> list: subB){
                List<String> subPartitions = new ArrayList<>();
                subPartitions.addAll(list);
                subPartitions.add(a);
                if(!set.contains(subPartitions)){
                    set.add(subPartitions);
                }
            }
        }
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++; right--;
            }else return false;
        }
        return true;
    }
    public static void main(String[] args){
        for(List<String> list: partition("abbbb")){
            System.out.println(list);
        }
    }
}
