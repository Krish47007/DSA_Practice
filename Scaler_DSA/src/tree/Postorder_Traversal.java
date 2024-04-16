package tree;

import java.util.ArrayList;

public class Postorder_Traversal {

    private void generatePostorder(ArrayList<Integer> ans, TreeNode node) {

        if (node == null)
            return;
        generatePostorder(ans, node.left);
        generatePostorder(ans, node.right);
        ans.add(node.val);
    }

    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        generatePostorder(ans, A);
        return ans;
    }
}
