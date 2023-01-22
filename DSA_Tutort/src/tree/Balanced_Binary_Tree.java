package tree;

public class Balanced_Binary_Tree {

    int isBalancedTree(TreeNode root)
    {
        if(root == null)
            return 0;

        int lh = isBalancedTree(root.left);

        //If leftsubtree is not balanced, entire tree is not balanced.
        if(lh == -1)
            return -1;

        int rh = isBalancedTree(root.right);

        //If rightsubtree is not balanced, entire tree is not balanced.
        if(rh == -1)
            return -1;

        //If diff. b/w leftsubtree and rightsubtree > 1 means unbalanced
        if(Math.abs(lh-rh) > 1)
            return -1;

        //Return the height of the tree
        return 1 + Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {

        return isBalancedTree(root) != -1;

    }
}
