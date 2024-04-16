package tree.assignments;

public class Maximum_Depth_of_Binary_Tree {


    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return 1 + Math.max((root.left != null ? maxDepth(root.left) : 0), (root.right != null ? maxDepth(root.right) : 0));


    }
}
