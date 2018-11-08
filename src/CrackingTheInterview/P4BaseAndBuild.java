package CrackingTheInterview;

import java.util.ArrayList;
import java.util.List;

public class P4BaseAndBuild {
    public static List<Character[]> permutations(String str){
        List<Character[]> ls = new ArrayList<>();
        char[] strchars = str.toCharArray();

        for(int i = 0; i < strchars.length; i++){
            if(ls.isEmpty()){
                ls.add(new Character[]{strchars[i]});
            }else{
                for(int j = 0; j < ls.size(); j++){
                    Character[] current = ls.get(j);
                    System.out.printf("Current length is %d", current.length);


                    for(int k = 0; k < current.length + 1; k++){
                        Character[] construct = new Character[current.length + 1];
                        construct[k] = strchars[i];

                        int l = 0, m = 0;
                        while(l < construct.length){
                            System.out.printf("Iteration %d\n", l);
                            if(l != k) {
                                construct[l] = current[m];
                                m++;
                            }
                            l++;
                        }

                        System.out.printf("Constructed is %s\n", construct);
                        ls.add(construct);

                    }

                    ls.remove(current);



                }
            }
        }

        return ls;
    }

    public static void main(String[] args){
        for(Character[] array: permutations("ab")){
            System.out.printf("%s\t", array);
        }
    }
}
