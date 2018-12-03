package ActualQuestions;

import java.util.Arrays;

public class NoDuplicates {
    public static int duplicates(int[] array){
        int slow = 0;
        int fast = 1;

        while(fast < array.length){
            if(array[slow] < array[fast]){
                slow++;
                array[slow] = array[fast];
                fast++;
            }else{
                fast++;
            }
        }
        return slow + 1;
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,3,3,4};
        System.out.println(duplicates(array));
        System.out.println(Arrays.toString(array));
    }
}
