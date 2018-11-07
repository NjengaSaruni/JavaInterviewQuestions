package CrackingTheInterview;

public class P1PatternMatching {

    public static int minimum(int[] array, int left, int right){
        if(left == right){
            return array[left];
        }
        if((int)Math.pow(right - left, 2) == 1){
            if(array[right] < array[left]){
                return array[right];
            }else{
                return array[left];
            }
        }
        int mid = (left + right) / 2;

        if((int)Math.pow(mid - left, 2) == 1){
            if(array[mid] < array[left]){
                return array[mid];
            }else{
                return array[left];
            }
        }


        if(array[left] > array[mid]){
            return minimum(array, left , mid);
        }else{
            return minimum(array, mid + 1, right);
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{8, 9, 12, 1, 3, 5, 7, 7};
        System.out.println(minimum(array, 0, array.length - 1));
    }
}
