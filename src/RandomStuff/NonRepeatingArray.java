package RandomStuff;

import java.util.Arrays;

public class NonRepeatingArray {
    private static int nonRepeatingArray(int[] array) {
        int slow = 0;
        int fast = 1;

        while (fast < array.length) {
            if (array[slow] == array[fast]) {
                fast++;
            }else{
                slow++;
                array[slow] = array[fast];
                fast++;
            }
        }

        if (array.length == 0){
            return 0;
        }else {
            return slow + 1;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,3,4,5,5,5,5,8,8,9};
        int ans = nonRepeatingArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(ans);

    }
}
