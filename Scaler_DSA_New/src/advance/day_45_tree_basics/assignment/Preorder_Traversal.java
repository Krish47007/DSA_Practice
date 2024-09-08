package advance.day_45_tree_basics.assignment;

import java.util.ArrayList;

public class Preorder_Traversal {

    private void preorder(TreeNode root,ArrayList<Integer> ans)
    {
        if (root == null)
            return;
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();
        preorder(A,ans);
        return ans;
    }
}
