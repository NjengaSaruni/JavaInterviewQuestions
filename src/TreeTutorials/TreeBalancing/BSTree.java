package TreeTutorials.TreeBalancing;

import TreeTutorials.AVLTreeRecursive;
import Utils.TreePrinter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        System.out.println("here");
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

        node = balance(node);

        return node;
    }

    private Node balance(Node node){
        if(node.bf == -2){
            if(node.left.bf <= 0){
                return leftleftCase(node);
            }
            return leftRightCase(node);
        }
        if(node.bf == 2){
            if(node.right.bf >= 0){
                return rightRightCase(node);
            }
            return rightLeftCase(node);
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


    @Override
    public String toString() {
        return getTreeDisplay(root);
    }

    // Print a binary tree.
    public static String getTreeDisplay(Node root) {

        StringBuilder sb = new StringBuilder();
        List<List<String>>  lines = new ArrayList<List<String>>();
        List<Node> level = new ArrayList<>();
        List<Node> next  = new ArrayList<>();

        level.add(root);
        int nn = 1;
        int widest = 0;

        while (nn != 0) {
            nn = 0;
            List<String> line = new ArrayList<String>();
            for (Node n : level) {
                if (n == null) {
                    line.add(null);
                    next.add(null);
                    next.add(null);
                } else {
                    String aa = String.format("%d",n.value);
                    line.add(aa);
                    if (aa.length() > widest) widest = aa.length();

                    next.add(n.left);
                    next.add(n.right);

                    if (n.left != null) nn++;
                    if (n.right != null) nn++;
                }
            }

            if (widest % 2 == 1) widest++;

            lines.add(line);

            List<Node> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;
            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {

                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '#' : '#';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '#';
                        }
                    }
                    sb.append(c);

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            sb.append(' ');
                        }
                    } else {
                        for (int k = 0; k < hpw; k++) {
                            sb.append(j % 2 == 0 ? " " : "#");
                        }
                        sb.append(j % 2 == 0 ? "#" : "#");
                        for (int k = 0; k < hpw; k++) {
                            sb.append(j % 2 == 0 ? "#" : " ");
                        }
                    }
                }
                sb.append('\n');
            }
            for (int j = 0; j < line.size(); j++) {
                String f = line.get(j);
                if (f == null) f = "";
                int gap1 = (int) Math.ceil(perpiece / 2f - f.length() / 2f);
                int gap2 = (int) Math.floor(perpiece / 2f - f.length() / 2f);

                for (int k = 0; k < gap1; k++) {
                    sb.append(' ');
                }
                sb.append(f);
                for (int k = 0; k < gap2; k++) {
                    sb.append(' ');
                }
            }
            sb.append('\n');

            perpiece /= 2;
        }
        return sb.toString();
    }



}
