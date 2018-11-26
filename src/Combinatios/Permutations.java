package Combinatios;

import java.util.Arrays;

public class Permutations {
    private static int factorial(int k){
        if(k == 1) return 1;
        return k * factorial(k - 1);
    }
    public static Character[][] permutations(Character[] array){
        int arrayLength = array.length;
        int rows = factorial(arrayLength);

        Character[][] answer = new Character[arrayLength][rows];
        if(arrayLength == 1){
            answer[0][0] = array[0];
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

            Character[][] former = permutations(buffer);
            int count = 0;
            for(Character[] characters: former){
                Character[] newCharacters = new Character[arrayLength];
                newCharacters[0] = array[i];
                int j = 1;

                while(j < newCharacters.length){
                    newCharacters[j] = characters[j - 1];
                    j++;
                }
                answer[arrayLength * i + count] = newCharacters;
                count++;
            }
            System.out.println(Arrays.toString(answer[arrayLength * i + count]));
        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println(permutations(new Character[]{'1', '2', '3', '4'}));
    }
}
