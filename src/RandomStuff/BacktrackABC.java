package RandomStuff;

import java.util.ArrayList;
import java.util.List;

public class BacktrackABC {
    public static List<List<Character>> subsetArray(List<Character> original){
        List<List<Character>> answer = new ArrayList<>();

        backTrack(answer, original, 0, new ArrayList<>());
        return answer;
    }

    public static void backTrack(List<List<Character>> answer, List<Character> original, int start, List<Character> former){
        answer.add(new ArrayList<>(former));
        for(int i = start; i < original.size(); i++){
            former.add(original.get(i));
            backTrack(answer, original, i + 1, former);
            former.remove(former.size() - 1);
        }
    }

    public static void main(String[] args){
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');

        for(List<Character> ls: subsetArray(list)){
            System.out.println(ls);
        }
    }
}
