package tree;

import java.util.Stack;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {

    /*
    *  The idea is to do a dfs and as soon as we find a node that matches the one of the target node
    * we return that.Lets say its lh of x which is current node. Now the parent (x) will explore the other half of the tree, if the other half also returns true then
    * our answer is x. Else if the other half doesn't contain then x's first half contains both p and q
    * so we return x's that half.. it could be x's left or right half which ever first returned true.
    *
    * */

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root == p || root == q)
            return root;

        TreeNode lh  = root.left != null ? lowestCommonAncestor(root.left,p,q) : null;
        TreeNode rh = root.right != null ? lowestCommonAncestor(root.right,p,q) : null;

        if(lh != null && rh != null)
            return root;
        else if(lh != null)
            return lh;
        else
            return rh;

    }


}
