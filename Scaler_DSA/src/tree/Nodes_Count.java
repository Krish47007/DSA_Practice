package tree;

public class Nodes_Count {

    public int solve(TreeNode A) {

        return countNodes(A);
    }

    private int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        int leftCount = root.left != null ? countNodes(root.left) : 0;
        int rightCount = root.right != null ? countNodes(root.right) : 0;

        return 1 + leftCount + rightCount;
    }
}
