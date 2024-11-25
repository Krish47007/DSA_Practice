package advance.day_48_trees_3_BST.assignment;

import advance.day_45_trees_1_basics.TreeNode;

public class Delete_a_node_in_BST {

    public static TreeNode maxOfBST(TreeNode root)
    {
        if (root == null)
            return null;

        while (root.right != null)
            root = root.right;

        return root;
    }

    public static TreeNode deleteNodeFromBST(TreeNode root,int target)
    {
        if(root == null)
            return null;

        if (root.val > target)
            root.left = deleteNodeFromBST(root.left,target);
        else if (root.val < target)
            root.right = deleteNodeFromBST(root.right,target);
        else {
            //We found the element that we are looking
            //Now there can be 3 cases -
            // 1. target has no child
            if (root.left == null && root.right == null)
                return null;
                // 2. target has one child - either left or right
            else if (root.left == null && root.right != null)
                return root.right;
            else if (root.right == null && root.left != null)
                return root.left;
            else
            {
                /*
                    If target has both the children then we can do the followings:
                        1. Replace the target with the largest element from the left sub-tree
                                            or
                        2. Replace the target with the smallest element from the right sub-tree.
                */

                //Largest element from the lest sub tree
                TreeNode leftMax = maxOfBST(root.left);
                root.val = leftMax.val;

                //Now delete the leftMax
                root.left = deleteNodeFromBST(leftMax,leftMax.val);
            }
        }

        return root;

    }

    public TreeNode solve(TreeNode A, int B) {

        return deleteNodeFromBST(A,B);
    }

}
