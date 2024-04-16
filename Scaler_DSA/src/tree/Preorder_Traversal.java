package tree;

import java.util.ArrayList;

public class Preorder_Traversal {

    private void generatePreorder(ArrayList<Integer> ans, TreeNode node) {

        if (node == null)
            return;
        ans.add(node.val);
        generatePreorder(ans, node.left);
        generatePreorder(ans, node.right);
    }

    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();
        generatePreorder(ans, A);
        return ans;

    }
}
