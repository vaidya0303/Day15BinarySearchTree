package BTS;

/**
 * create class name as node
 * here initialize data,node left,node right.
 */
class Node {
    int data;
    Node left;
    Node right;

}

/**
 *  create class name as Binary tree
 *  in this class all method is non static so create object for this class in main method
 *  after creating object then call in this method is object name.method name
 */
public class BinaryTree {

    /**
     * create method name as insert
     * here parameter are passed name as root and val
     *
     * @param root
     * @param val
     * @return root
     */

    public Node insert(Node root, int val) {

        /*
         * if root is empty then return createnewNode and insreating value
         */
        if (root == null) {
            return craeteNewNode(val);
        }
        /*
         * if value value is greater than root data then insreating left side value
         */
        if (val < root.data) {
            root.left = insert(root.left, val);
            /*
             * if root is greater than value then value inserting right side
             */
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;

    }

    /**
     * create a method name as createNewNode
     * and passing parameter in int type
     */
    public Node craeteNewNode(int k) {
        /*
         * crete new node
         */
        Node bst = new Node();

        bst.data = k;
        bst.left = null;
        bst.right = null;
        return bst;
    }

    /**
     * create a method name as print
     * they are printing data
     *
     * @param root
     */
    public void print(Node root) {
        /*
         * check root is empty
         */
        if (root == null) {
            return;
        }
        /*
         *null left side
         */
        print(root.left);
        /*
         * data is k print
         */
        System.out.println(root.data);

        /*
         *null right side
         */
        print(root.right);
    }

    /*
     * Calculate the Size For checking all nodes are added or Not
     */
    public int size(Node node) {
        /*
         *  if condition is true then node is empty if condition is false then
         * else condition is worked
         */
        if (node == null)
            return 0;
        else
            return (size(node.left) + 1 + size(node.right));
    }

    /**
     *
     * here we create nodePresent method
     * this is parameterized method.root and value are passed
     * boolean type method so this method give o/p is true or false type.
     * @param root
     * @param val
     * @return isPresent
     */
    public boolean nodePresent(Node root, int val) {
        /**
         * if root is empty then return false
         */
        if (root == null) {
            return false;
        }
        /*
         * now boolean not isPresent
         */

        Boolean isPresent = false;

          /**
           * using while loop
           * root is not empty then check
           * value is greater than data then root is left
           * if value is less than data then root is right side
           * if both condition is false then isPresent is true
           * got this true condition then stop this loop
           * here break keyword is used for if got the true condition then loop is break
           * now condition is true then return isPresent
           *
           */
        while (root != null) {
            if (val < root.data) {
                root = root.left;
            } else if (val > root.data) {
                root = root.right;
            } else {
                isPresent = true;
                break;
            }

        }
        return isPresent;
    }
}