package Combinatios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static List<Character[]> permutations(Character[] array){
        int arrayLength = array.length;

        List<Character[]> answer = new ArrayList<>();
        if(arrayLength == 1){
            answer.add(new Character[]{array[0]});
            return answer;
        }

        for(int i = 0; i < arrayLength; i++){
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
        }

        return answer;
    }
    public static void main(String[] args){
        List<Character[]> list = permutations(new Character[]{'1', '2', '3', '4'});
        for(Character[] characters: list){
            System.out.println(Arrays.toString(characters));
        }
    }
}
