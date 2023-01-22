package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            int size = q.size();

            List<Integer> tempList = new ArrayList<>();
            for(int i = 1;i<=size;i++)
            {
                TreeNode temp = q.poll();
                tempList.add(temp.val);

                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right !=  null)
                    q.add(temp.right);
            }

            ans.add(tempList);
        }
        return ans;
    }
}
