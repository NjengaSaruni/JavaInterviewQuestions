package TreeTutorials.TreeBalancing;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class BSTree {
    private Node root;
    private LinkedList<Integer> list = new LinkedList<>();
    private class Node {
        int value;
        Node left, right;
        public int bf;
        public int height;

        Node(int v){
            this.value = v;
        }
    }

    public void insert(int value){
        Node node = new Node(value);
        if(root == null){
            root = node;
        }else {
            root = insert(value, root);
        }
    }


    private Node insert(int value, Node node){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        else{
            node.right = insert(value, node.right);
        }

        update(node);

        return balance(node);
    }

    private Node balance(Node node){
        if(node.bf == -2){
            if(node.left.bf <= 0){
                leftleftCase(node);
            }else{
                leftRightCase(node);
            }
        }
        if(node.bf == 2){
            if(node.right.bf >= 0){
                rightRightCase(node);
            }
            else{
                rightLeftCase(node);
            }
        }

        return node;
    }

    private Node leftleftCase(Node node){
        return rightRotate(node);
    }

    private Node rightRightCase(Node node){
        return leftRotate(node);
    }

    private Node leftRightCase(Node node){
        node.left = leftRotate(node.left);
        return rightRightCase(node);
    }

    private Node rightLeftCase(Node node){
        node.right = rightRotate(node.right);
        return leftleftCase(node);
    }

    private Node rightRotate(Node node){
        Node newParent = node.left;
        node.left = newParent.right;
        newParent.right = node;
        update(node);
        update(newParent);

        return newParent;
    }

    private Node leftRotate(Node node) {
        Node newParent = node.right;
        node.right = newParent.left;
        newParent.left = node;
        update(node);
        update(newParent);

        return newParent;
    }

    public void remove(int value){
        if(root == null) return;
        else {
            remove(value, root);
        }
    }

    public void update(Node node){
        int leftNodeHeight = (node.left == null) ? -1 : node.left.height;
        int rightNodeHeight = (node.right == null) ? -1 : node.right.height;

        node.height = 1 + Math.max(leftNodeHeight, rightNodeHeight);
        node.bf = rightNodeHeight - leftNodeHeight;
    }

    private void remove(int value, Node node){
        if(node == null){
            throw new NoSuchElementException();
        }
        if(value < node.value){
            remove(value, node.left);
        }
        if(value > node.value){
            remove(value, node.right);
        }else{
            if(node.right  == null){
                node = node.left;
                return;
            }
            if(node.left == null){
                node = node.right;
                return;
            }
            Node minNode = findMin(node.right);
            node.value = minNode.value;

        }
    }

    private Node findMin(Node node){
        if(node == null){
            throw new NullPointerException();
        }
        Node temp = node;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }



}
