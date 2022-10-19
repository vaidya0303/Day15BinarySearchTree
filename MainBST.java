package BTS;



/**
 * 1. Ability to create a BST by adding 56 and then adding 30 & 70
 *    Use INode to create My Binary Node
 *    Note the key has to extend comparable to compare and determine left or right node
 *    First add 56 as root node so 30 will be added to left and 70 to right
 *
 * 2. Ability to create the binary tree shown in the figure
 *    Check if all are added with using size method in Binary Tree
 *
 * 3. Ability to search 63 in the Binary Tree
 *    Implement Search method and recursively search Left or Right Nodes to find 63
 *
 *
 * ---in main method all operation is executed
 * ---in Binary Tree all operation is done
 *
 */

/*
 * main class name as MainBst
 */
public class MainBST {

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

        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);

        bst.print(root);

        /**
         * if condition is true then 1st print o/p is boolean type coz this is boolean method
         */

        System.out.println(bst.nodePresent(root, 63));

        /**
         * if else statement is used if condition is true then print 63 is present is binary tree
         * if condition false then print 63 is not present in binary tree.
         */

        if(root != null)
            System.out.println("\nElement 63 is present in the binary tree");
        else
            System.out.println("\nElement 63 is not present in the binary tree");
    }

    }