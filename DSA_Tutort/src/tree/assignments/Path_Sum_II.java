package tree.assignments;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        getSum(root,targetSum,ans,tempList);

        return ans;
    }

    private void getSum(TreeNode root, int targetSum, List<List<Integer>> ans, List<Integer> tempList) {

        if(root == null)
            return;

        tempList.add(root.val);

        /*Even when the sum is 0 at an internal node level,
        * we must examine till leaf node
        */
        if(targetSum - root.val == 0 && root.left == null && root.right == null)
        {
            ans.add(new ArrayList<>(tempList));
            tempList.remove(tempList.size() - 1);
            return;
        }

        if(root.left != null)
            getSum(root.left,targetSum - root.val,ans,tempList);
        if(root.right != null)
            getSum(root.right,targetSum - root.val,ans,tempList);

        tempList.remove(tempList.size() - 1);

    }
}
