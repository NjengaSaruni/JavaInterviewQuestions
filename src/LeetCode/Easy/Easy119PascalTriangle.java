package LeetCode.Easy;

import java.util.Arrays;
import java.util.List;

public class Easy119PascalTriangle {
    public static List<Integer> getRrow(int rowIndex){
        List<Integer> list;

        Integer[] temp = new Integer[rowIndex + 1];
        temp[0] = 1;
        temp[rowIndex] = 1;

        if(rowIndex == 0){
            list = Arrays.asList(temp);
            return list;
        }

        List<Integer> former = getRrow(rowIndex - 1);

        for(int i = 1; i < rowIndex; i++){
            temp[i] = former.get(i - 1) + former.get(i);
        }

        list = Arrays.asList(temp);
        return list;
    }

    public static void main(String[] args){
        System.out.println(getRrow(4));
    }
}
