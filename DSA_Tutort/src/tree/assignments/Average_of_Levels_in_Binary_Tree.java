package tree.assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new LinkedList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            int sz = q.size();
            double sum = 0;
            for (int i = 1;i<=sz;i++)
            {
                TreeNode temp = q.poll();
                sum+=temp.val;

                if(temp.left!= null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }

            ans.add(sum/sz);
        }

        return ans;

    }
}
