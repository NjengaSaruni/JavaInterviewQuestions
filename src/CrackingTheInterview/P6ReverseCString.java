package CrackingTheInterview;

public class P6ReverseCString {
    public static char[] reverse(char[] str){
        // A string starting with null is an empty string
        return new char[]{'\0', str[0]};
    }
    public static void main(String[] args){
        String str = "abcd";
        char[] reversed = reverse(str.toCharArray());
        System.out.println(reversed);
    }
}
