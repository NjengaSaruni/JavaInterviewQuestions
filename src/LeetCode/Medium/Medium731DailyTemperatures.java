package LeetCode.Medium;

import java.util.*;

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

    private static int[] dailyTempsA(int[] temps) {
        int[] answer = new int[temps.length];

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 1; i < temps.length; i++){
            if(!map.containsKey(temps[i])){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(temps[i], list);
            }else{
                List<Integer> list = map.get(temps[i]);
                list.add(i);
                map.put(temps[i], list);
            }
        }

        for(int i = 0; i < temps.length; i++){
            int next = temps[i] + 1;
            while(next <= 100 && answer[i] == 0){
                if(map.containsKey(next)){
                    List<Integer> candidates = map.get(next);
                    for(Integer candidate: candidates){
                        if(candidate > i){
                            if(answer[i] > 0){
                                if(candidate - i < answer[i]){
                                    answer[i] = candidate - i;
                                }
                            }else{
                                answer[i] = candidate - i;
                            }
                        }
                    }
                }
                next+=1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(dailyTempsA(new int[]{73,74,75,71,69,72,76,73})));
        System.out.println(Arrays.toString(dailyTemps(new int[]{73,74,75,71,69,72,76,73})));
    }
}
