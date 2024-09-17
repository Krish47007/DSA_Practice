package advance.day_47_trees_2_views_types.classroom;

import advance.day_45_tree_basics.TreeNode;

public class Height_Of_A_Binary_Tree {

    public static int calculateHeight(TreeNode root)
    {
        if (root == null)
            return 0;

        return 1 + Math.max(calculateHeight(root.left),calculateHeight(root.right));
    }

    public static void main(String[] args) {

        /*
                    10
                   /   \
                5        15
              /   \      /
             3     8    12
                         \
                          9
         */

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.left.right = new TreeNode(9);

        System.out.println(calculateHeight(root));
    }
}
