package tree.assignments;

import javafx.util.Pair;

import java.util.*;


public class Maximum_Width_of_Binary_Tree {

    /*At the end of each level,
    we use the indices of the first and the last elements on the same level,
    in order to obtain the width of the level.
    */
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        int maxWidth = 1;
        LinkedList<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 0));

        while (!q.isEmpty()) {
            int sz = q.size();

            //First and Last node of every level
            Pair<TreeNode, Integer> firstNode = q.peekFirst();
            Pair<TreeNode, Integer> lastNode = null;

            for (int i = 1; i <= sz; i++) {
                lastNode = q.removeFirst();
                int indexVal = lastNode.getValue();
                if (lastNode.getKey().left != null)
                    q.addLast(new Pair<>(lastNode.getKey().left, 2 * indexVal));

                if (lastNode.getKey().right != null)
                    q.addLast(new Pair<>(lastNode.getKey().right, 2 * indexVal + 1));

            }

            //calculate width of last level
            //by comparing the first and last col_index.
            maxWidth = Math.max(maxWidth, lastNode.getValue() - firstNode.getValue() + 1);


        }

        return maxWidth;
    }
}
