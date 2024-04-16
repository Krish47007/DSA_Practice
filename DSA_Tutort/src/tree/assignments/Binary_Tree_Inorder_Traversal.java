package tree.assignments;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        inOrder(root, ans);

        return ans;
    }

    private void inOrder(TreeNode root, List<Integer> ans) {

        if (root == null)
            return;

        if (root.left != null)
            inOrder(root.left, ans);

        ans.add(root.val);

        if (root.right != null)
            inOrder(root.right, ans);


    }
}
