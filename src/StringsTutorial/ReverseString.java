/*Write a function that takes a string as input and returns the string reversed.

        Example 1:

        Input: "hello"
        Output: "olleh"
        Example 2:

        Input: "A man, a plan, a canal: Panama"
        Output: "amanaP :lanac a ,nalp a ,nam A"

        Thought process:

        Middle out*/
package StringsTutorial;

public class ReverseString {
    public static String reverseString(String s) {
        if(s.length() <= 1){
            return s;
        }
        char[] reversed = s.toCharArray();
        int center = reversed.length / 2;
        int left = center - 1;
        int right = center + 1;
        char hold;
        if(s.length() % 2 == 0){
            hold = reversed[center];
            reversed[center] = reversed[center - 1];
            reversed[center - 1] = hold;
            left = center - 2;
        }
        if(s.length() > 2){
            while(left >= 0){
                hold = reversed[left];
                reversed[left] = reversed[right];
                reversed[right] = hold;
                left--;
                right++;
            }
        }

        return new String(reversed);
    }
    public static void main(String[] args){
        System.out.print(reverseString("1232"));
    }
}
