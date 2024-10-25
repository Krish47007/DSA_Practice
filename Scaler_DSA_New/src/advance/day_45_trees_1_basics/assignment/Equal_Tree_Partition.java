package advance.day_45_trees_1_basics.assignment;

public class Equal_Tree_Partition {

    private long sumTree(TreeNode root)
    {
        if (root == null)
            return 0;
        long leftSubTreeSum = root.left != null ? sumTree(root.left) : 0;
        long rightSubTreeSum = root.right != null ? sumTree(root.right) : 0;
        return leftSubTreeSum + rightSubTreeSum + root.val;
    }

    private boolean treeWithHalfSum(TreeNode root, long totalSum)
    {
        if (root == null)
            return false;

        //disconnect the current node and check if there exists a subtree with half sum
        //check left sum
        long ls = sumTree(root.left);
        if(ls == totalSum/2)
            return true;
        //check right sum
        long rs = sumTree(root.right);
        if (rs == totalSum/2)
            return true;

        // If we reach here means we dont have a sub tree with half sum if we disconnect the tree from this node.
        //May be we can get it by doing so from one of its children.

        if (treeWithHalfSum(root.left,totalSum))
            return true;
        if (treeWithHalfSum(root.right,totalSum))
            return true;

        return false;
    }
    public int solve(TreeNode A) {

        long totalSum = sumTree(A);
        if(totalSum % 2 != 0)
            return 0;

        return treeWithHalfSum(A,totalSum) ? 1 : 0;
    }
}
