package tree;

import java.util.HashMap;
import java.util.Map;

public class Path_Sum_III {

    public int pathSum(TreeNode root, int targetSum) {

        int[] count = new int[1];

        Map<Long,Integer> map = new HashMap<>();

        getCount(root,map,targetSum,0L,count);
        return count[0];

    }
    private void getCount(TreeNode root, Map<Long, Integer> map, long targetSum, long currSum, int[] count) {

        if(root == null)
            return;

        currSum += root.val;


        if(currSum == targetSum)
            count[0]++;

        count[0] += map.getOrDefault(currSum - targetSum,0);

        map.put(currSum,map.getOrDefault(currSum,0) + 1);

        if(root.left != null)
            getCount(root.left,map,targetSum,currSum,count);

        if(root.right != null)
            getCount(root.right,map,targetSum,currSum,count);

        map.put(currSum,map.get(currSum) - 1);
    }


}
