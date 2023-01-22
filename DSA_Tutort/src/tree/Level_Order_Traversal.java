package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal {

    public static void levelOrder(TreeNode root)
    {
        if(root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            int size = q.size();

            for(int i = 1;i<=size;i++)
            {
                TreeNode temp = q.poll();
                System.out.print(temp.val+" ");

                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right !=  null)
                    q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);

        levelOrder(root);
    }

}
