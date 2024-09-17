package advance.day_45_tree_basics.classroom;

import advance.day_45_tree_basics.TreeNode;

public class PostOrder_Traversal {

    public static void postorder(TreeNode root)
    {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val +" ");
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

        postorder(root);
    }
}
