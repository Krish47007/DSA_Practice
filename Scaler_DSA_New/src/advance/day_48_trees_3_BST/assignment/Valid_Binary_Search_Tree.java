package advance.day_48_trees_3_BST.assignment;

import advance.day_45_trees_1_basics.TreeNode;

public class Valid_Binary_Search_Tree {

    private int prev = Integer.MIN_VALUE;

    public boolean checkBST(TreeNode root)
    {
        if (root == null)
            return true;

        boolean ans = checkBST(root.left);
        if (!ans)
            return false;

        if (root.val <= prev)
            return false;
        else if (root.val > prev)
            prev = root.val;

        return checkBST(root.right);
    }

    public int isValidBST(TreeNode A) {

        return checkBST(A) ? 1 : 0;
    }
}
