/*Thought process
*
* [4,6,2,66,2,1,66,76]
*
* [4,6,2,66] --- [2,1,6,76]
*
* [4,6] [2,66] --- [2, 1] [6,76]
*
* [4] [6]  --- [2, 66] --- [2] [1] --- [6] [76]
*
* [4] --- [6] --- [2] --- [66] --- [2] --- [1] --- [6] --- [76]
*
* []
**/
package Sorting;

import java.util.Arrays;

public class MergeSort {
    private static int[] sort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
        int[] answer = new int[array.length];

        left = sort(left);
        right = sort(right);

        int l = 0;
        int r = 0;
        int i = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                answer[i] = left[l];
                l++;
            } else {
                answer[i] = right[r];
                r++;
            }
            i++;
        }
        while (l < left.length) {
            answer[i] = left[l];
            l++;
            i++;
        }
        while (r < right.length) {
            answer[i] = right[r];
            r++;
            i++;
        }

        System.out.printf("Current answer is %s\n\n", Arrays.toString(answer));

        return answer;


    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 6, 2, 66, 2, 10909, 66, 80, 76};
        System.out.println(Arrays.toString(sort(array)));
    }
}
