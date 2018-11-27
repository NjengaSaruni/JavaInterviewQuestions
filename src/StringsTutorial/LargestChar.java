package StringsTutorial;

public class LargestChar {
    public static char largest(String s){
        char largest = s.charAt(0);
        for(char c: s.toCharArray()){
            if(c > largest) largest = c;
        }
        return largest;
    }

    public static void main(String[] args){
        System.out.println(largest("ABcdzYjkalP"));
    }
}
