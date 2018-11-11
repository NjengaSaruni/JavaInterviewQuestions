package RandomStuff;

import java.util.HashMap;
import java.util.Map;

public class R2Fibonacci {
    public static int fibIter(int index){
        int previous = 1;
        int beforePrevious = 1;
        for(int i = 2; i <= index; i++){
            int hold = previous;
            previous = previous + beforePrevious;
            beforePrevious = hold;
        }
        return previous;
    }

    public static int fibRecursive(int index){
        if(index <= 1){
            return 1;
        }
        return fibRecursive(index - 1) + fibRecursive(index - 2);
    }
    public static int fibRecursiveDict(int index, Map<Integer, Integer> map){
        if(map.containsKey(index)){
            return map.get(index);
        }
        int previous = fibRecursive(index - 1);
        map.put(index - 1, previous);

        int beforePrevious = fibRecursive(index - 2);
        map.put(index - 2, beforePrevious);

        return previous + beforePrevious;

    }
    public static void main(String[] args){
        System.out.println(fibIter(35));
//        System.out.println(fibRecursive(6));

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(1, 1);
        System.out.println(fibRecursiveDict(35, map));
    }
}
