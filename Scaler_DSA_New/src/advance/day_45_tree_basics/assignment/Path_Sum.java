package advance.day_45_tree_basics.assignment;

public class Path_Sum {

    public int checkSum(TreeNode root,int sum,int target)
    {
        if(root == null )
            return 0;

        sum += root.val;
        //If current node is leaf node and finds the sum
        if(root.left == null && root.right == null && sum == target)
            return 1;

        //If left sub-tree completes the sum
        if(checkSum(root.left,sum,target) == 1)
            return 1;
        //If right sub-tree completes the sum
        if(checkSum(root.right,sum,target) == 1)
            return 1;

        return 0;

    }
    public int hasPathSum(TreeNode A, int B) {

        return checkSum(A,0,B);
    }
    ///////////  Above is my solution ////////////
    //Better code optimisation
    public int hasPathSu_1(TreeNode A, int B) {
        boolean status = sum(A, 0, B);
        return status ? 1 : 0;
    }
    public boolean sum(TreeNode A, int curSum, int reqSum) {
        if (A == null) {
            return false;
        }
        if (A.left == null && A.right == null) {
            curSum += A.val;
            if (curSum == reqSum)
                return true;
            return false;
        }
        int sum = curSum + A.val;
        return sum(A.left, sum, reqSum) || sum(A.right, sum, reqSum);
    }
}
