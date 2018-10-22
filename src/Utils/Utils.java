package Utils;

import java.util.Map;

public class Utils {
    public static void printMapCharInt(Map<Character, Integer> map){
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void printMapStringInt(Map<String, Integer> map){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void main(String[] args){}
}
