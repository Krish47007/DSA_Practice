package tree;

public class Sum_of_nodes_of_a_Binary_Tree {

    public int solve(TreeNode A) {

        return sumOfAllNodes(A);
    }

    private int sumOfAllNodes(TreeNode root) {

        if (root == null)
            return 0;
        int leftSum = root.left != null ? sumOfAllNodes(root.left) : 0;
        int rightSum = root.right != null ? sumOfAllNodes(root.right) : 0;

        return root.val + leftSum + rightSum;
    }
}
