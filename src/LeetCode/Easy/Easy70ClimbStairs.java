package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class Easy70ClimbStairs {
    private static int climbStairs(int n, Map<Integer, Integer> map){
        if(map.containsKey(n)) {
            return map.get(n);
        }
        int a = climbStairs(n - 1 );
        int b = climbStairs(n - 2);
        map.put(n , a + b);
        map.put(n - 1 , a);
        map.put(n - 2, b);
        return a + b;
    }
    public static int climbStairs(int n){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);

        return climbStairs(n, map);
    }
    public static void main(String[] args){
        System.out.println(climbStairs(38));
    }
}
