package advance.day_48_trees_3_BST.assignment;

import advance.day_45_trees_1_basics.TreeNode;

public class Search_in_BST {

    private int searchNode(TreeNode root,int B)
    {
        if(root == null)
            return 0;
        if (root.val == B)
            return 1;
        else if(root.val < B)
            return searchNode(root.right,B);
        else
            return searchNode(root.left,B);
    }

    public int solve(TreeNode A, int B) {

        return searchNode(A,B);
    }
}
