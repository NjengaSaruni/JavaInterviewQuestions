
/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

        A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

        2 - [a, b, c]
        3 - [d, e, f]
        4 - [g, h, i]
        5 - [j, k, l]
        6 - [m, n, o]
        7 - [p, q, r, s]
        8 - [t, u, v]
        9 - [w, x, y ,z]

        Example:

        Input: "23"
        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
        Note:

        Although the above answer is in lexicographical order, your answer could be in any order you want.

        Thought process:

        store number in hashmap
        store answer in List<String> combinations = new ArrayList<String>();


        create three/four String arrays with the characters given


        */
package Combinatios;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Telephone {
    public static List<String> letterCombinations(String digits) {
        Map<Integer, String[]> map = new HashMap<>();
        List<String> combinations = new ArrayList<String>();

        map.put(2, new String[]{"a", "b", "c"});
        map.put(3, new String[]{"d", "e", "f"});
        map.put(4, new String[]{"g", "h", "i"});
        map.put(5, new String[]{"j", "k", "l"});
        map.put(6, new String[]{"m", "n", "o"});
        map.put(7, new String[]{"p", "q", "r", "s"});
        map.put(8, new String[]{"t", "u", "v"});
        map.put(9, new String[]{"w", "x", "y", "z"});


        char[] numbers = digits.toCharArray();
        for(char digit: numbers){
            int number = Character.getNumericValue(digit);

            if(combinations.isEmpty()) {
                for (String str : map.get(number)) {
                    combinations.add(str);
                }
            }else{
                List<String> newCombinations = new ArrayList<>();
                for(String str: map.get(number)){
                    for(String strCmb : combinations){
                        strCmb += str;
                        newCombinations.add(strCmb);
                    }
                }
                combinations = newCombinations;
            }
        }

        return combinations;

    }

    public static void main(String[] args){
        System.out.println(letterCombinations("23"));
    }
}
