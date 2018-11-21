/*Design an algorithm and write code to find the first common ancestor of two nodes
        in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
        necessarily a binary search tree.


        */
package TreeTutorials;

import Utils.TreeNode;

public class CommonAncestor {
    public static TreeNode ancestor(TreeNode root, TreeNode left, TreeNode right){
        if(left.val <= root.val && right.val > root.val) return root;
        if(left.val > right.val) return ancestor(root.right, left, right);
        return ancestor(root.left, left, right);
    }
    public static void main(String[] args){
        TreeNode root = CreateTreeFromSortedArray.minimalTree(new int[]{1,2,4,5,6,7,8});
        TreeNode left = null, right = null, temp = root;
        while(temp.left != null){
            left = temp.left;
            temp = temp.left;
        }
        temp = root.left;
        while(temp.right != null){
            right = temp.right;
            temp = temp.right;
        }
        System.out.println(ancestor(root, left, right));

    }
}
