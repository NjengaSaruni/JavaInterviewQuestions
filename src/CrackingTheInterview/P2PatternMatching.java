package CrackingTheInterview;

public class P2PatternMatching {

    public static int minimum(int[] array, int left, int right){
        if(left == right){
            return array[left];
        }

        int mid = (left + right + 1) / 2;

        if(array[left] > array[mid]){
            if(array[mid] < array[mid -1]) return array[mid];
            return minimum(array, left + 1, mid - 1);
        }else {
            if(array[left] < array[right]) return array[left];
            return minimum(array, mid + 1, right);
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{9, 10, 1, 2, 3, 5, 5, 6, 9};
        System.out.println(minimum(array, 0, array.length - 1));
    }
}
