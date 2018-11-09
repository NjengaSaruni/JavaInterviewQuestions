package CrackingTheInterview;

public class P8TestCharInt {
    public static void main(String[] args){
        for(char i = 0; i < 256; i++){
            System.out.printf(" Character is %c\t", i);
            System.out.printf(" Character is %d\n\n", (int)i);
            System.out.printf("%c", 65);
        }
    }
}
