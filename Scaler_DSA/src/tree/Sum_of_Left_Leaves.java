package tree;

import java.util.ArrayList;
import java.util.List;

public class Sum_of_Left_Leaves {

    /*
     * Check solution again
     * */
    public int solve(TreeNode A) {

        List<Integer> ans = new ArrayList<>();
        sumLeftLeaves(A, ans, false);

        int sum = 0;
        for (int x : ans)
            sum += x;

        return sum;
    }

    private void sumLeftLeaves(TreeNode root, List<Integer> ans, boolean isLeftLevel) {

        if (root == null)
            return;

        if (isLeftLevel && root.left == null && root.right == null)
            ans.add(root.val);

        sumLeftLeaves(root.left, ans, true);
        sumLeftLeaves(root.right, ans, false);


    }
}
