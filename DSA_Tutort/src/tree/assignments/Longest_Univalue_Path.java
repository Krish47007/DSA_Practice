package tree.assignments;

public class Longest_Univalue_Path {

    int count = 0;
    public int longestUnivaluePath(TreeNode root) {

        getPath(root);
        return count;
    }

    private int getPath(TreeNode root) {

        if(root == null)
            return 0;

        int leftLength = getPath(root.left);
        int rightLength = getPath(root.right);

        int leftArrowLength = 0,rightArrowLength = 0;

        if(root.left != null && root.left.val == root.val)
            leftArrowLength = leftLength + 1;

        if(root.right != null && root.right.val == root.val)
            rightArrowLength = rightLength + 1;

        count = Math.max(count,leftArrowLength + rightArrowLength);

        return Math.max(leftArrowLength,rightArrowLength);
    }
}
