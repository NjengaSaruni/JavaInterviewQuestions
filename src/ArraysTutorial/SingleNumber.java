/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

        Note:

        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Example 1:

        Input: [2,2,1]
        Output: 1
        Example 2:

        Input: [4,1,2,1,2]
        Output: 4

        Use a set and a hashmap:
        [2 ] ->
        [2 ] -> no increase


        */
package ArraysTutorial;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    private static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return 0;
    }
    public static void main(String[] args){
        System.out.print(singleNumber(new int[]{1,1,2,2,3}));
    }
}
