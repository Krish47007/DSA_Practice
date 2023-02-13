package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_Odd_Levels_of_Binary_Tree {

    private void reverseNodes(TreeNode p,TreeNode q,boolean oddLevel)
    {
        if( p == null || q == null)
            return;
        //swap the values at oddlevel no need to swap links
        if(oddLevel)
        {
            int temp = p.val;
            p.val = q.val;
            q.val = temp;
        }

        //swapping values from left and right subtrees
        reverseNodes(p.left,q.right,!oddLevel);
        reverseNodes(p.right,q.left,!oddLevel);

    }

    public TreeNode reverseOddLevels(TreeNode root) {

        reverseNodes(root.left,root.right,true);
        return root;
    }

}
