package advance.day_47_trees_2_views_types.classroom;

import advance.day_45_tree_basics.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Left_View_Of_Binary_Tree {

    public static List<Integer> leftView(TreeNode root)
    {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        List<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        TreeNode last = root;

        while (!q.isEmpty())
        {
            TreeNode curr = q.poll();
            if(curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);

            if (curr == last)
            {
                if(!q.isEmpty()) {
                    ans.add(q.peekFirst().val);
                    last = q.peekLast();
                }
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

        System.out.println(leftView(root));
    }
}
