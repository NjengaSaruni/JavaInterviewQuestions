package ArraysTutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicates {
    public static List<Integer> dupes(Integer[] array){
        Set<Integer> dupeSet = new HashSet<>();
        Set<Integer> answerSet = new HashSet<>();

        for(Integer value: array){
            if(!dupeSet.contains(value)){
                dupeSet.add(value);
            }else{
                answerSet.add(value);
            }
        }

        List<Integer> ans = new ArrayList<>();
        ans.addAll(answerSet);

        return ans;
    }
    public static void main(String[] args){
        System.out.println(dupes(new Integer[]{1,2,3,3}));
        System.out.println(dupes(new Integer[]{1,2,2,3}));
        System.out.println(dupes(new Integer[]{1,2,2,3,8,99,8}));
    }
}
