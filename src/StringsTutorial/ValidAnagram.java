/*Given two strings s and t , write a function to determine if t is an anagram of s.

        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:

        Input: s = "rat", t = "car"
        Output: false
        Note:
        You may assume the string contains only lowercase alphabets.

        Follow up:
        What if the inputs contain unicode characters? How would you adapt your solution to such case?

        Thought process:

        Use HashMap:

        a -> 3
        n -> 1
        g -> 1
        r -> 1
        m -> 1
        */
package StringsTutorial;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void printMap(Map<Character, Integer> map){
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static boolean isAnagram(String s, String t) {
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char value: schars){
            if(map.containsKey(value)){
                map.put(value, map.get(value) + 1);
            }else{
                map.put(value, 1);
            }
        }

        for(char value: tchars){
            if(map.containsKey(value)){
                if(map.get(value) > 1){
                    map.put(value, map.get(value) - 1);
                }
                else{
                    map.remove(value);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args){
        System.out.print(isAnagram("moooo", "omooo"));
    }
}
