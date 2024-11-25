package advance.day_48_trees_3_BST.classroom;

import advance.day_45_trees_1_basics.TreeNode;

import java.util.List;

public class BSTImpl {

    /*
        For inserting in BST first we have to search for the element and then
        insert it when not found. So when coming out of recursion call we need to
        attach the newly created node.
     */
    public static TreeNode insertInBST(TreeNode root,int val)
    {
        if(root == null)
        {
            TreeNode node = new TreeNode(val);
            return node;
        }
        if(root.val > val)
            root.left = insertInBST(root.left,val);
        else if (root.val < val)
            root.right = insertInBST(root.right,val);

        return root;
    }

    public static TreeNode search(TreeNode root,int target)
    {
        if (root == null)
            return null;
        if (root.val == target)
            return root;
        if (root.val > target)
            return search(root.left,target);
        else
            return search(root.right,target);
    }

    public static TreeNode createBST(List<Integer> list)
    {
        TreeNode root = null;
        for (int x : list)
        {
            root = insertInBST(root,x);
        }
        return root;
    }

    public static TreeNode minOfBST(TreeNode root)
    {
        if (root == null)
            return null;

        while (root.left != null)
            root = root.left;

        return root;
    }
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

                //The leftMax node is always a leaf node or a node with only a left child.
                //Now delete the leftMax
                root.left = deleteNodeFromBST(root.left,leftMax.val);
            }
        }

        return root;

    }

    public static void inorder(TreeNode root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val+ " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        TreeNode root = createBST(List.of(5,4,2,8,9,3,1));
        inorder(root);
        System.out.println();
        System.out.println("Min of BST : " + minOfBST(root).val);
        System.out.println("Max of BST : " + maxOfBST(root).val);

        //delete 8
        root = deleteNodeFromBST(root,8);
        inorder(root);
        System.out.println();
        //delete 3
        root = deleteNodeFromBST(root,3);
        inorder(root);
        System.out.println();

        //delete 2
        root = createBST(List.of(5,4,2,8,9,3,1));
        root = deleteNodeFromBST(root,2);
        inorder(root);
        System.out.println();

        //delete 5
        root = createBST(List.of(6,9,4,8,3));
        root = deleteNodeFromBST(root,3);
        inorder(root);
        System.out.println();

    }
}
