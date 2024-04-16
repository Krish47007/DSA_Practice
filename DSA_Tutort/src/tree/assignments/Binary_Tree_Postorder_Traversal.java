package tree.assignments;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Postorder_Traversal {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        postOrder(root, ans);

        return ans;
    }

    private void postOrder(TreeNode root, List<Integer> ans) {

        if (root == null)
            return;

        if (root.left != null)
            postOrder(root.left, ans);
        if (root.right != null)
            postOrder(root.right, ans);

        ans.add(root.val);
    }
}
