package advance.day_48_trees_3_BST.classroom;

import advance.day_45_trees_1_basics.TreeNode;

public class Check_Valid_BST {

    public boolean checkBST(TreeNode root,int prev)
    {
        if (root == null)
            return true;

        if (root.val < prev)
            return false;
        if (root.val > prev)
            prev = root.val;

        return checkBST(root.left,prev) && checkBST(root.right,prev);
    }
}
