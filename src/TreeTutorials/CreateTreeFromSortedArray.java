/*Given a sorted (increasing order) array, write an algorithm to create a binary tree with
        minimal height.

        */
package TreeTutorials;

import Utils.TreeNode;

public class CreateTreeFromSortedArray {

    private static TreeNode minimalTree(int[] array, int left, int right){
        int mid = (right + left + 1) / 2;
        TreeNode node = new TreeNode(array[mid]);

        if(left == right) return node;
        if(left < mid) node.left = minimalTree(array, left, mid - 1);
        if(right > mid) node.right = minimalTree(array, mid + 1, right);

        return node;
    }
    public static TreeNode minimalTree(int[] array){
        return minimalTree(array, 0, array.length -  1);
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,4,5,6,7,8};
        TreeNode tree = minimalTree(array);
        System.out.println(tree);
    }
}
