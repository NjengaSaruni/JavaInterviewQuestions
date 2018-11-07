package CrackingTheInterview;

import java.util.HashMap;
import java.util.Map;

public class P3RansonNote {

    public static boolean ransomable(String source, String note){
        Map<String, Integer> sourceMap =  new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        createMap(source, sourceMap);
        createMap(note, noteMap);

        for(Map.Entry<String, Integer> entry: noteMap.entrySet()){
            if(!(sourceMap.containsKey(entry.getKey()) && sourceMap.get(entry.getKey()) == entry.getValue())){
                return false;
            }
        }
        return true;
    }

    private static void createMap(String source, Map<String, Integer> sourceMap) {
        for(String str: source.split("\\s")){
            if(sourceMap.containsKey(str)){
                int value = sourceMap.get(str);
                sourceMap.put(str, value + 1);
            }else{
                sourceMap.put(str, 1);
            }
        }
    }

    public static void main(String[] args){
        String source = "James is a good man";
        String note = "is James aa";

        System.out.println(ransomable(source, note));
    }
}
