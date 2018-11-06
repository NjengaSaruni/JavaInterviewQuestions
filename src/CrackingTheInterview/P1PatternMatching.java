package CrackingTheInterview;

public class P1PatternMatching {

    public static int minimum(int[] array){
        int mid = array.length / 2;

        return array[mid];
    }

    public static void main(){
        System.out.println(minimum(new int[]{8,9,1,3,5}));
    }
}
