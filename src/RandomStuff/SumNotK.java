package RandomStuff;

import org.jetbrains.annotations.NotNull;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumNotK {
    public static int largest(@NotNull int[] array, int k){
        Set<Integer> set = new HashSet<>();
        int size = 0;

        for(int i = 0; i < array.length; i++){
            int value = array[i] % k;
            if(!set.contains(k - (array[i] % k))){
                if(array[i] != k){
                    size++;
                    set.add((array[i] % k));
                }
            }else {
                System.out.printf("Skipped %d\n", array[i]);
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            int complement = array[i] % k;
            if(map.containsKey(complement)){
                map.put(complement, map.get(complement) + 1);
            }else {
                map.put(complement, 1);
            }
        }

        System.out.println(map);
        return size;
    }

    public static void main(String[] args){
        System.out.println(largest(new int[]{278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436}, 7));
    }
}
