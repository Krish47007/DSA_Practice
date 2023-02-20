package tree.assignments;

public class Sum_Root_to_Leaf_Numbers {

    public static int sumNumbers(TreeNode root) {

        int []totalSum = {0};
        calSum(root,0,totalSum);
        return totalSum[0];

    }

    private static void calSum(TreeNode root, int pathSum, int[] totalSum) {

        if(root == null)
            return;

        pathSum += root.val;

        if(root.left == null && root.right == null)
        {
            totalSum[0] += pathSum;
            return;
        }

        calSum(root.left,pathSum*10,totalSum);
        calSum(root.right,pathSum*10,totalSum);


    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(sumNumbers(root));

    }
}
