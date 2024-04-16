package tree;

public class Tree_Height {

    public int solve(TreeNode A) {

        return height(A);
    }

    private int height(TreeNode root) {

        if (root == null)
            return 0;
        int lh = root.left != null ? height(root.left) : 0;
        int rh = root.right != null ? height(root.right) : 0;

        return 1 + Math.max(lh, rh);
    }
}
