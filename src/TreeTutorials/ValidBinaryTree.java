//Given a binary tree, determine if it is a valid binary search tree (BST).
//
//        Assume a BST is defined as follows:
//
//        The left subtree of a node contains only nodes with keys less than the node's key.
//        The right subtree of a node contains only nodes with keys greater than the node's key.
//        Both the left and right subtrees must also be binary search trees.
//        Example 1:
//
//        Input:
//        2
//        / \
//        1   3
//        Output: true
//        Example 2:
//
//        5
//        / \
//        1   4
//        / \
//        3   6
//        Output: false
//        Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
//        is 5 but its right child's value is 4.


package TreeTutorials;

import Utils.TreeNode;

public class ValidBinaryTree {
    public static boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return isValidBST(root, root.val, root.val);
    }

    public static boolean isValidBST(TreeNode root, int max, int min) {
        if (root == null) return true;
        if (root.left != null && (root.left.val >= root.val || root.left.val > max)) return false;
        if (root.right != null && (root.right.val <= root.val || root.right.val < min)) return false;

        return isValidBST(root.left, max, min) && isValidBST(root.right, max, min);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(15);
        root.insert(6);
        root.insert(9);

        System.out.println(isValidBST(root));
    }
}
