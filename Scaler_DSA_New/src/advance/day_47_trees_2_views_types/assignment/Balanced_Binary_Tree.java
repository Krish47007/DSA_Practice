package advance.day_47_trees_2_views_types.assignment;

import advance.day_45_trees_1_basics.TreeNode;

public class Balanced_Binary_Tree {

    /*
         A binary tree is height balanced if the height of the left subtree
         and height of the right subtree satisfies the following :
          | H_lst - H_rst | should be either equal to 0 or 1.
     */

    private static int calculateHeight(TreeNode root)
    {
        if (root == null)
            return 0;

        return 1 + Math.max(calculateHeight(root.left),calculateHeight(root.right));
    }

    private boolean isHeightBalanced(TreeNode root)
    {
        if(root == null)
            return true;

        int heightLST = calculateHeight(root.left);
        int heightRST = calculateHeight(root.right);

        if (Math.abs(heightLST - heightRST) > 1)
            return false;

        return isHeightBalanced(root.left) && isHeightBalanced(root.right);
    }

    public int isBalanced(TreeNode root) {

        return isHeightBalanced(root) ? 1 : 0;

    }
}
