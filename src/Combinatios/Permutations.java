package Combinatios;

import java.util.*;

public class Permutations {
    public static List<Character[]> permutations(Character[] array){
        int arrayLength = array.length;

        List<Character[]> answer = new ArrayList<>();
        if(arrayLength == 1){
            answer.add(new Character[]{array[0]});
            return answer;
        }

        Set<Character> set = new HashSet<>();
        for(int i = 0; i < arrayLength; i++){
            if(!set.contains(array[i])){
                Character[] buffer = new Character[arrayLength - 1];
                int k = 0;

                for(int j = 0; j < arrayLength; j++){
                    if(j != i){
                        buffer[k] = array[j];
                        k++;
                    }
                }

                List<Character[]> former = permutations(buffer);
                for(Character[] characters: former){
                    Character[] newCharacters = new Character[arrayLength];
                    newCharacters[0] = array[i];
                    int j = 1;

                    while(j < newCharacters.length){
                        newCharacters[j] = characters[j - 1];
                        j++;
                    }
                    answer.add(newCharacters);
                }
                set.add(array[i]);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        List<Character[]> list = permutations(new Character[]{'1', '3', '1'});
        for(Character[] characters: list){
            System.out.println(Arrays.toString(characters));
        }
    }
}
