package tree.assignments;

import java.util.LinkedList;
import java.util.Queue;

public class Subtree_of_Another_Tree {

    boolean isIdentical(TreeNode t, TreeNode s) {
        if (t == null && s == null)
            return true;
        else if (t == null || s == null)
            return false;
        else {
            if (t.val != s.val)
                return false;

        }

        return isIdentical(t.left, s.left) && isIdentical(t.right, s.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null || subRoot == null)
            return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean isSubtree = false;
        while (!q.isEmpty()) {
            int sz = q.size();

            for (int i = 0; i < sz; i++) {
                TreeNode temp = q.poll();

                if (temp.val == subRoot.val) {
                    isSubtree = isIdentical(temp, subRoot);
                    if (isSubtree)
                        return isSubtree;
                }

                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }

        return isSubtree;
    }
}
