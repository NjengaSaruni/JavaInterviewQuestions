/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

        Examples:

        s = "leetcode"
        return 0.

        s = "loveleetcode",
        return 2.
        Note: You may assume the string contain only lowercase letters.

        Thought process:

        add chars to a HashMap:

        v -> 2
        t -> 7
        c -> 8
        d -> 10

        */
package StringsTutorial;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void printMap(Map<Character, Integer> map){
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static int firstUniqChar(String s) {
        char[] schar = s.toCharArray();

        Map<Character, Integer> map= new LinkedHashMap<>();

        for(int i = 0; i < schar.length; i++){
            if(map.containsKey(schar[i])){
                map.put(schar[i], -1);
            }else{
                map.put(schar[i], i);
            }
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() != -1){
                return entry.getValue();
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.print(firstUniqChar("leetcode"));
    }
}
