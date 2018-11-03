/*Given two binary trees, write a function to check if they are the same or not.

        Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

        Example 1:

        Input:     1         1
        / \       / \
        2   3     2   3

        [1,2,3],   [1,2,3]

        Output: true
        Example 2:

        Input:     1         1
        /           \
        2             2

        [1,2],     [1,null,2]

        Output: false
        Example 3:

        Input:     1         1
        / \       / \
        2   1     1   2

        [1,2,1],   [1,1,2]

        Output: false*/
package LeetCode.Easy;

public class Easy100SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) return q == null;
        if (q == null) return false;
        if(p.val == q.val) return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.right.left = new TreeNode(7);


        TreeNode t2  = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        t2.left.left = new TreeNode(4);
        t2.right.left = new TreeNode(7);



        System.out.println(isSameTree(t1, t2));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val = x;
    }
}