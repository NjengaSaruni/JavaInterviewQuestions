package LeetCode.Medium;

import java.util.Arrays;

public class Medium731DailyTemperatures {
    private static int[] dailyTemps(int[] temps){
        int[] answer = new int[temps.length];

        for(int i = 0; i < temps.length - 1; i++){
            for(int j = i + 1; j < temps.length; j++){
                if(temps[j] > temps[i]){
                    answer[i] = j - i;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(dailyTemps(new int[]{73, 74, 75, 71, 69, 72, 76,73})));
    }
}
