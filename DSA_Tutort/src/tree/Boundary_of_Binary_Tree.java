package tree;

import java.util.ArrayList;
import java.util.List;

public class Boundary_of_Binary_Tree {
    /*
     * The idea is to print the left boundary elements first
     * then print leaf nodes
     * then print right boundary elements is reverse order.
     * But there are some corner cases
     *   1. If a node is part of left boundary but has no left child but a right child then
     *      the right child becomes part of left boundary.
     *   2. Same goes for right boundary node also
     *
     *   Refer LC question and example
     * */

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        if (root == null)
            return res;
        //Adding root node
        res.add(root.val);


        //Printing left boundary nodes
        if (root.left != null)
            printLeftBoundary(root.left, res);
        //Printing leaf nodes
        if (root.left != null || root.right != null)
            printLeafNodes(root, res);
        //Printing right boundary nodes
        if (root.right != null)
            printRightBoundary(root.right, res);

        return res;
    }

    private void printRightBoundary(TreeNode root, List<Integer> res) {

        //If leaf node
        if (root.left == null && root.right == null)
            return;
        if (root.right != null) {
            printRightBoundary(root.right, res);
        } else {
            printRightBoundary(root.left, res);
        }
        res.add(root.val);
    }

    private void printLeafNodes(TreeNode root, List<Integer> res) {

        if (root.left == null && root.right == null) {
            res.add(root.val);
            return;
        }
        if (root.left != null)
            printLeafNodes(root.left, res);
        if (root.right != null)
            printLeafNodes(root.right, res);
    }

    private void printLeftBoundary(TreeNode root, List<Integer> res) {

        //If leaf node
        if (root.left == null && root.right == null)
            return;

        res.add(root.val);
        if (root.left != null) {
            printLeftBoundary(root.left, res);
        } else
            printLeftBoundary(root.right, res);
    }
}
