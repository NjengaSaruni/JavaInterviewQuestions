package RandomStuff;

public class Algebra {
    public static String simplify(String str){
        char[] strChar = str.toCharArray();
        String answer = "";
        int currentMultiplier = 0;

        for(char c: strChar){
            if(Character.isDigit(c)){
                currentMultiplier = Character.getNumericValue(c);
            }else{
                String temp = "";
                for(int i = 0; i < currentMultiplier; i++){
                    temp += c;
                }
                answer+= temp;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        String str = "1a2b3c";
        System.out.println(simplify(str));
    }
}
