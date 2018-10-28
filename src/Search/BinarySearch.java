package Search;

public class BinarySearch {
    private static int _binarySearch(int[] array, int value, int left, int right){
        if(left == right){
            if(array[left] == value){
                return left;
            }
            else{
                return -1;
            }
        }
        int mid = (left + right) / 2;
        if(array[mid] == value){
            return mid;
        }else if(array[mid] > value){
            return _binarySearch(array, value,left, mid - 1);
        }else{
            return _binarySearch(array, value,mid+ 1, right);
        }
    }
    public static int indexOf(int[] array, int value){
        return _binarySearch(array, value, 0, array.length -1 );
    }

    public static void main(String[] args){
        int[] sortedArray = new int[]{1,2,3,4,5,6,6,7,9};
        System.out.print(indexOf(sortedArray, 10));
    }
}
