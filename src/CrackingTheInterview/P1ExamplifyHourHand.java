package CrackingTheInterview;

public class P1ExamplifyHourHand {
    public static int angle(int hour, int minute){
        return Math.abs((hour % 12) * 30 - minute * 6);
    }
    public static void main(String[] args){
        System.out.println(angle(12, 30));
    }
}
