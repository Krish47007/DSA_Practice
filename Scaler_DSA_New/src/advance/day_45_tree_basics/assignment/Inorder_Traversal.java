package advance.day_45_tree_basics.assignment;

import java.util.ArrayList;

public class Inorder_Traversal {

    private void inorder(TreeNode root,ArrayList<Integer> ans)
    {
        if(root == null)
            return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }

    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();
        inorder(A,ans);
        return ans;
    }
}
