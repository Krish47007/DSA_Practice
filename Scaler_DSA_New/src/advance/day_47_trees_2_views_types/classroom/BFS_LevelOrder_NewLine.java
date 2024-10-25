package advance.day_47_trees_2_views_types.classroom;

import advance.day_45_trees_1_basics.TreeNode;

import java.util.ArrayDeque;

public class BFS_LevelOrder_NewLine {

    public static void levelOrderTraversal(TreeNode root)
    {
        if(root == null)
            return;

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.addFirst(root);
        TreeNode lastNode = root;

        while (!q.isEmpty())
        {
            TreeNode curr = q.poll();
            System.out.print(curr.val +" ");
            if(curr.left != null)
                q.add(curr.left);

            if(curr.right != null)
                q.add(curr.right);

            if(lastNode == curr)
            {
                System.out.println();
                if(!q.isEmpty())
                    lastNode = q.peekLast();
            }
        }
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

        levelOrderTraversal(root);
    }
}
