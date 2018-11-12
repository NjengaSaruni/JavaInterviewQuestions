package TreeTutorials;

import Utils.TreeNode;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class TraversalPreOrder {
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.insert(5);
        root.insert(6);
        root.insert(9);
        root.insert(0);

        System.out.println(preorderTraversal(root));
        System.out.println(preorderTraversalIterative(root));

        System.out.println(postorderTraversal(root));


    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        traversePreOrder(root, list);

        return list;
    }


    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        traversePostOrder(root, list);

        return list;
    }

    private static void traversePostOrder(TreeNode node, List<Integer> list){
        if(node != null){
            traversePostOrder(node.left, list);
            list.add(node.val);
            traversePostOrder(node.right, list);
        }
    }

    private static void traversePreOrder(TreeNode node, List<Integer> list){
        if(node != null){
            list.add(node.val);
            traversePreOrder(node.left, list);
            traversePreOrder(node.right, list);
        }
    }

    public static List<Integer> preorderTraversalIterative(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()){
            TreeNode current = stack.pop();
            if(current != null){
                list.add(current.val);
                stack.push(current.right);
                stack.push(current.left);
            }
        }

        return list;
    }
}
