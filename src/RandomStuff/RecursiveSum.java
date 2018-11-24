package RandomStuff;

public class RecursiveSum {
    private static int sum(int[] array, int left, int right){
        if(left == right) return array[left];

        int mid = (left + right)/2;
        return sum(array, left, mid) + sum(array, mid + 1, right);
    }
    public static int sum(int[] array){
        return sum(array, 0, array.length - 1);
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4};
        System.out.println(sum(array));
    }
}
