package advance.day_48_trees_3_BST.classroom;

import advance.day_45_trees_1_basics.TreeNode;

import java.util.List;

public class CreateBSTFromSortedArray {

    public static TreeNode buildTree(List<Integer> list,int beg,int end)
    {
        if (beg > end )
            return null;

        int mid = beg + (end - beg)/2;

        //Create a new node
        TreeNode node = new TreeNode(list.get(mid));
        //Build left half
        node.left = buildTree(list,beg,mid - 1);
        //Build right half
        node.right = buildTree(list,mid+1,end);

        return node;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6);
        TreeNode root = buildTree(list,0,list.size() - 1);
        BSTImpl.inorder(root);
        System.out.println();
    }
}
