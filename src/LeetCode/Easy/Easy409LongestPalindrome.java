package LeetCode.Easy;

public class Easy409LongestPalindrome {
    private static int[] palindromeIndex(String str, int left, int right){
        if(left == 0 || right == str.length()){
            return new int[]{left, right};
        }
        if(str.charAt(left) == str.charAt(right)){
            return palindromeIndex(str, left - 1, right + 1);
        }
        return new int[]{left, right};
    }
    public static String longestPalindrome(String str){
        String longest;
        for(int i = 0; i < str.length() - 1; i++){
            int[] indexA = palindromeIndex(str, i, i);
            int[] indexB = palindromeIndex(str, i, i + 1);

            System.out.printf("Index A for %d is left: %d, right: %d\n", i, indexA[0], indexA[1]);
            System.out.printf("Index B for %d is left: %d, right: %d\n", i, indexB[0], indexB[1]);

        }

        return str;
    }
    public static void main(String[] args){
        System.out.println(longestPalindrome("aaecbceade"));
    }
}
