/*Implement strStr().

        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

        Example 1:

        Input: haystack = "hello", needle = "ll"
        Output: 2
        Example 2:

        Input: haystack = "aaaaa", needle = "bba"
        Output: -1
        Clarification:

        What should we return when needle is an empty string? This is a great question to ask during an interview.

        For the purpose of this problem, we will return 0 when needle is an empty string.

        Thought process:

        */
package StringsTutorial;

public class NeedleHaystack {
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int hLength = haystack.length(); // 5
        int nLength = needle.length(); // 2

        for(int i = 0; i < hLength - nLength + 1; i++){ // 5 - 3 = 2
            // Implement substr here
            String substr = haystack.substring(i, i + nLength);
            if(substr.equals(needle)){
                return i;
            }
        }
        return -1;
//
    }
    public static void main(String[] args){
        System.out.print(strStr("powerlll", "lll"));
    }
}
