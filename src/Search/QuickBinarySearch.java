package Search;

public class QuickBinarySearch {
    private static int binary(int[] array, int value, int left, int right){
        if(left == right){
            return left;
        }
        int mid = (left + right + 1) / 2;

        if(array[mid] == value) return mid;
        else if(array[mid] > value) return binary(array, value, left, mid - 1);
        else return binary(array, value, mid + 1, right);
    }
    public static int search(int[] array, int value){
        return binary(array, value, 0, array.length - 1);
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,4,5,8,9};
        System.out.println(search(array, 6));
    }
}
