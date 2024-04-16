package tree;

import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean fromLeft = true;
        while (!q.isEmpty()) {
            LinkedList<Integer> res = new LinkedList<>();
            int size = q.size();

            for (int i = 1; i <= size; i++) {
                TreeNode temp = q.poll();

                if (fromLeft)
                    res.add(temp.val);
                else
                    res.addFirst(temp.val);

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);

            }

            ans.add(res);
            fromLeft = !fromLeft;


        }

        return ans;
    }
}
