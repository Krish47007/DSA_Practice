package advance.day_45_tree_basics.classroom;

import advance.day_45_tree_basics.TreeNode;

public class PreOrder_Traversal {

    public static void preorder(TreeNode root)
    {
        if (root == null)
            return;
        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
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

        preorder(root);
    }
}
