package tree;

public class Root_Equals_Sum_of_Children {

    public boolean checkTree(TreeNode root) {

        if (root == null || (root.left == null && root.right == null))
            return true;
        else if (root.left == null || root.right == null)
            return false;
        else {

            if (root.left.val + root.right.val != root.val)
                return false;

            return checkTree(root.left) && checkTree(root.right);
        }

    }
}
