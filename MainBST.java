package BTS;

/**
 *  Ability to create a BST by adding 56 and then adding 30 & 70
 *   Use INode to create My Binary Node
 *   Note the key has to extend comparable to compare and determine left or right node
 *   First add 56 as root node so 30 will be added to left and 70 to right
 *
 */

/*
 * main class name as MainBst
 */
public class MainBst {

    /*
     * main method all program execute in main method
     */
    public static void main(String[] args) {

        /*
         * 1st print the welcome msg.
         */
        System.out.println("welcome to BTS program");

        /*
         * create object for BinaryTree
         * object name as bst
         * create object coz in this class all method is non static so we cannot directly call this method
         * so we create object for this class
         * if all methods are static then call this method directly
         *
         */

        BinaryTree bst = new BinaryTree();
        /*
         * root is empty
         */
        Node root = null;

        /*
         * inserting the value in root
         *
         * calling method is =object name.method name
         *
         * hear bst is object and insert is method and 56 is value is adding in root
         */
        root = bst.insert(root, 56);

        root = bst.insert(root, 30);

        // 30->56->70->80
        root = bst.insert(root, 70);

        /*
         * printing the inserting data
         *
         * 56,30,70
         */
        bst.print(root);



    }

}
