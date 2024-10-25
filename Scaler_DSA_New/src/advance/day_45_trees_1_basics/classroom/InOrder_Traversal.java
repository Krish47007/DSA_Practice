package advance.day_45_trees_1_basics.classroom;

import advance.day_45_trees_1_basics.TreeNode;

public class InOrder_Traversal {

    public static void inorder(TreeNode root)
    {
        if(root == null)
            return;
        //Traverse left
        inorder(root.left);
        //Print current node data
        System.out.print(root.val +" ");
        inorder(root.right);
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

        inorder(root);
    }
}
