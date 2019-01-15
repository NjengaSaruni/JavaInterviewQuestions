package Search;

public class IterativeBinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length;

        while(left < right) {
            int mid = (left + right) / 2;
            if(array[mid] == target) {
                return mid;
            }
            if(array[mid] > target) {
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        System.out.println(binarySearch(new int[]{1,2,4,5,7,11}, 11));
    }
}
