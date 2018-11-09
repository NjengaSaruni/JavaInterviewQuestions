package CrackingTheInterview;

import java.util.Arrays;

public class P10Anagrams {

    private static boolean areAnagrams(String a, String b){
        char[] achars = a.toCharArray();
        char[] bchars = b.toCharArray();

        Arrays.sort(achars);
        Arrays.sort(bchars);

        return new String(achars).equals(new String(bchars));
    }

    private static boolean areAnagramsArrayASCII(String a, String b) {
        int[] valuesA = new int[256];
        int[] valuesB = new int[256];
        int[] intValues = new int[a.length()];

        for(char charA: a.toCharArray()){
            valuesA[charA]++;
        }
        for(char charB: b.toCharArray()){
            valuesB[charB]++;
        }
        for(int i = 0; i < 256; i++){
            if(valuesA[i] != valuesB[i]) return false;
        }
        return true;

    }
    public static void main(String[] args){
        String a = "lisaat<en";
        String b = "sileaan<t";

        System.out.println(areAnagramsArrayASCII(a, b));

    }
}
