package advance.day_48_trees_3_BST.assignment;


import advance.day_45_trees_1_basics.TreeNode;

public class Sorted_Array_To_Balanced_BST {

    private TreeNode buildTree(int[] A, int beg, int end)
    {
        if (beg > end )
            return null;

        int mid = beg + (end - beg)/2;

        //Create a new node
        TreeNode node = new TreeNode(A[mid]);
        //Build left half
        node.left = buildTree(A,beg,mid - 1);
        //Build right half
        node.right = buildTree(A,mid+1,end);

        return node;
    }
    public TreeNode sortedArrayToBST(final int[] A) {

        return buildTree(A,0,A.length-1);
    }
}
