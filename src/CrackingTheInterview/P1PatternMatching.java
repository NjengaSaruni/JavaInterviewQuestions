package CrackingTheInterview;

public class P1PatternMatching {

    public static int minimum(int[] array, int left, int right){
        if(left == right){
            return array[left];
        }
        int mid = (left + right) / 2;

        if(array[left] > array[mid]){
            return minimum(array, left + 1, mid);
        }

        return -1;
    }

    public static void main(String[] args){
        int[] array = new int[]{8,9,1,3,5};
        System.out.println(minimum(array, 0, array.length - 1));
    }
}
