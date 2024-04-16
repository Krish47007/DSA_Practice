package tree;

public class Maximum_Depth_of_Binary_Tree {

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        int lh = 0, rh = 0;

        if (root.left != null)
            lh = maxDepth(root.left);
        if (root.right != null)
            rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);

    }
}
