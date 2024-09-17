package advance.day_47_trees_2_views_types.assignment;

import advance.day_45_tree_basics.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelOrder {

    public static ArrayList<ArrayList<Integer>> solve(TreeNode root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        TreeNode lastNode = root;
        ArrayList<Integer> temp = new ArrayList<>();

        while (!q.isEmpty())
        {
            TreeNode curr = q.poll();
            //add value to temp
            temp.add(curr.val);

            if(curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);

            if (curr.equals(lastNode))
            {
                ans.add(temp);
                //next level is already enqueued
                if( !q.isEmpty())
                    lastNode = q.peekLast();
                //create a new arraylist for next level.
                temp = new ArrayList<>();
            }

        }

        return ans;
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

        System.out.println(solve(root));
    }
}
