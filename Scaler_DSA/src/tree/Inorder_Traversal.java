package tree;

import java.util.ArrayList;

public class Inorder_Traversal {

    private void generateInorder(ArrayList<Integer> ans, TreeNode node) {

        if (node == null)
            return;
        generateInorder(ans, node.left);
        ans.add(node.val);
        generateInorder(ans, node.right);
    }


    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();
        generateInorder(ans, A);
        return ans;

    }

}
