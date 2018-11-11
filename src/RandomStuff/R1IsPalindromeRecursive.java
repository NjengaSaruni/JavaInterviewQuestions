package RandomStuff;

public class R1IsPalindromeRecursive {
    public static boolean isPal(String str, int i, int j){
        if( i >= j) return true;
        if(str.charAt(i) == str.charAt(j)) return isPal(str, i + 1, j - 1);
        return false;
    }
    public static void main(String[] args){
        System.out.println(isPal("oomoo", 0, "oomoo".length() -  1));
    }
}
