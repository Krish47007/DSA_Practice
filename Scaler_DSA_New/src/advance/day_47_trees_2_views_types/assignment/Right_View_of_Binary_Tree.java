package advance.day_47_trees_2_views_types.assignment;

import advance.day_45_trees_1_basics.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Right_View_of_Binary_Tree {

    public static ArrayList<Integer> solve(TreeNode root) {

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();

        q.add(root);
        TreeNode lastNode = root;

        while (!q.isEmpty())
        {
            TreeNode curr = q.poll();
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);

            if (curr.equals(lastNode))
            {
                ans.add(curr.val);
                if (!q.isEmpty())
                    lastNode = q.peekLast();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /*
                    10
                   /   \
                5        15
              /   \      /
             3     8    12

         */

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);

        System.out.println(solve(root));
    }

}
