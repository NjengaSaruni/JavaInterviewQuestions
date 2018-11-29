package TreeTutorials.TreeBalancing;

public class BSTreeTester {
    public static void main(String[] args){
        BSTree tree = new BSTree();

        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(10);
        tree.insert(17);
        tree.insert(18);

        System.out.println(tree);

        tree.remove(1);

        System.out.println(tree);

    }
}
