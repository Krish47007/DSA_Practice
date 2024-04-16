package tree;

public class Path_Sum {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null)
            return false;
        //Path has to be from root to leaf so if the sum becomes 0 at leaf node then its correct
        if ((root.left == null && root.right == null) && (targetSum - root.val == 0))
            return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }


}
