package TreeTutorials;

public class Tester {
    public static void main(String[] args){

        AVLTreeRecursive<Integer> avlTree = new AVLTreeRecursive<>();

        avlTree.insert(1);
        avlTree.insert(2);
        avlTree.insert(3);
        avlTree.insert(6);
        avlTree.insert(7);
        avlTree.insert(5);
        avlTree.insert(9);

        System.out.println(avlTree);

    }
}
