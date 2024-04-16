package tree;

public class Diameter_of_Binary_Tree {

    /*
     * The diameter of a binary tree is the length of the longest path
     * between any two leaf nodes in a tree. This path may or may not pass through the root.
     */
    public int height(TreeNode root, int[] diameter) {
        if (root == null)
            return 0;
        int lh = root.left != null ? height(root.left, diameter) : 0;
        int rh = root.right != null ? height(root.right, diameter) : 0;

        //diameter of the node considering the current node as root
        diameter[0] = Math.max(diameter[0], 1 + lh + rh);

        //Height of the node
        return Math.max(lh, rh) + 1;

    }

    public int diameterOfBinaryTree(TreeNode root) {

        int[] diameter = new int[1];

        height(root, diameter);

        return diameter[0] - 1;


    }
}
