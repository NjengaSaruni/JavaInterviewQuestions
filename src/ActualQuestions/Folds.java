package ActualQuestions;

import java.util.ArrayList;
import java.util.List;

public class Folds {
    public static List<Boolean> foldsRecursive(int n){
        List<Boolean> list = new ArrayList<>();

        if(n == 1){
            list.add(false);
            return list;
        }

        List<Boolean> former = foldsRecursive(n - 1);
        list.addAll(former);
        list.add(false);
        int count = list.size() - 2;

        while (count >= 0){
            list.add(!former.get(count));
            count--;
        }

        return list;
    }
    public static void main(String[] args){
        System.out.println(foldsRecursive(3));
    }
}
