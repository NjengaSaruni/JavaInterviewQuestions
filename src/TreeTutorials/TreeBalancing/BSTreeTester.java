package TreeTutorials.TreeBalancing;

import TreeTutorials.AVLTreeRecursive;

public class BSTreeTester {
    public static void main(String[] args){
        BSTree tree = new BSTree();

        tree.insert(10);
        tree.insert(9);
        tree.insert(8);
        tree.insert(7);
        tree.insert(6);
        tree.insert(5);
        tree.insert(4);
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);

        System.out.println(tree);

    }
}
