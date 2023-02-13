package tree.assignments;


public class Minimum_Depth_of_Binary_Tree {

    public int minDepth(TreeNode root) {

        if(root == null)
            return 0;

        return 1 + Math.min(minDepth(root.left),minDepth(root.right));

    }
}
