package advance.day_47_trees_2_views_types.classroom;

import advance.day_45_trees_1_basics.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Left_View_Of_Binary_Tree_Recursive {

    //Do a pre-order traversal but print only the 1st element on every level

    static int visitedLevel = 0;
    public static void preOrder(TreeNode root, int currLevel, List<Integer> ans)
    {
        if(root == null)
            return;
        if(visitedLevel < currLevel)
        {
            ans.add(root.val);
            visitedLevel = currLevel;
        }
        preOrder(root.left,currLevel + 1,ans);
        preOrder(root.right,currLevel + 1,ans);
    }

    private static List<Integer> leftView(TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();
        preOrder(root,1,ans);
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

        System.out.println(leftView(root));
    }
}
