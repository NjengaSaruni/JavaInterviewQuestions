package TreeTutorials;

import Utils.TreeNode;

import java.util.*;

public class TraversalPreOrder {
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.insert(2);
        root.insert(31);
        root.insert(28);
        root.insert(35);
        root.insert(4);
        root.insert(1);
        root.insert(1);
        root.insert(11);
        root.insert(12);


        System.out.println(preorderTraversal(root));
        System.out.println(preorderTraversalIterative(root));

        System.out.println(inorderTraversal(root));
        System.out.println(inorderTraversalIterative(root));

        System.out.println(postorderTraversal(root));
//        System.out.println(postorderTraversalIterative(root));

        for(List<Integer> array: levelOrder(root)){
            System.out.println(array);
        }

        System.out.printf("Max height of tree is %d\n", maxDepth(root));

        System.out.println(isSymmetric(root));

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        traversePreOrder(root, list);

        return list;
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        traverseInOrder(root, list);

        return list;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        traversePostOrder(root, list);

        return list;
    }

    private static void traverseInOrder(TreeNode node, List<Integer> list){
        if(node != null){
            traverseInOrder(node.left, list);
            list.add(node.val);
            traverseInOrder(node.right, list);
        }
    }

    private static void traversePreOrder(TreeNode node, List<Integer> list){
        if(node != null){
            list.add(node.val);
            traversePreOrder(node.left, list);
            traversePreOrder(node.right, list);
        }
    }

    private static void traversePostOrder(TreeNode node, List<Integer> list){
        if(node != null){
            traversePostOrder(node.left, list);
            traversePostOrder(node.right, list);
            list.add(node.val);
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

    public static List<Integer> inorderTraversalIterative(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(root);

        while(!stack.isEmpty()){
            if(stack.peek() == null){
                stack.pop();
            }
            else if(stack.peek().left != null) {
                if (list.isEmpty() || stack.peek().left.val > list.get(list.size() - 1)){
                    stack.push(stack.peek().left);
                }else {
                    TreeNode current = stack.pop();
                    list.add(current.val);
                    stack.push(current.right);
                }
            }else{
                TreeNode current = stack.pop();
                list.add(current.val);
                stack.push(current.right);
            }
        }
        return list;
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        if(root != null){
            queue.offer(root);
        }

        while(!queue.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                levelList.add(node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            list.add(levelList);
        }

        return list;
    }

    public static int maxDepth(TreeNode root){
        return root == null ?  0:  1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    private static boolean areIdentical(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        else if(node1 == null || node2 == null){
            return false;
        }else if(node1.val == node2.val){
            return areIdentical(node1.left, node2.right) && areIdentical(node1.right , node2.left);
        }
        return false;
    }

    public static boolean isSymmetric(TreeNode root){
        return areIdentical(root, root);
    }

    class NodeSeen {
        TreeNode node;
        boolean seen;

        NodeSeen(TreeNode node, boolean seen){
            this.node = node;
            this.seen = seen;
        }
    }
}
