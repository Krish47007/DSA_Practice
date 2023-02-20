package tree.assignments;


/*
*  Every node is telling its parent node how many coins it needs.This includes the coins to be passed
* to its child nodes + coins for itself if it needs
* */
public class Distribute_Coins_in_Binary_Tree {

    public int distributeCoins(TreeNode root) {

        int[] totalMoves = {0};
        getMoves(root,totalMoves);
        return totalMoves[0];

    }

    private int getMoves(TreeNode root, int[] totalMoves) {

        if(root == null)
            return 0;

        //gives us coins required/has
        int lh = getMoves(root.left,totalMoves);
        int rh = getMoves(root.right,totalMoves);

        totalMoves[0] += Math.abs(lh) + Math.abs(rh);

        //current nodes requirement/has
        // -1 because 1 coin needs to be kept for current node too.
        return lh + rh + root.val - 1;
    }
}
