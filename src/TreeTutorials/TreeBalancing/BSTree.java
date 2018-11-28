package TreeTutorials.TreeBalancing;

import java.util.LinkedList;

public class BSTree {
    private Node root;
    private LinkedList<Integer> list = new LinkedList<>();
    private class Node {
        int value;
        Node left, right;

        Node(int v){
            this.value = v;
        }
    }

    public void insert(int value){
        Node node = new Node(value);
        if(root == null){
            root = node;
        }else {
            insert(value, root);
        }
    }

    private Node insert(int value, Node node){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }else{
            node.right = insert(value, node.right);
        }

        return node;
    }



}
