package advance.day_47_trees_2_views_types.additional;

public class Binary_Tree_From_Inorder_And_Preorder {
/*
    private static TreeNode buildTreeRecursively(ArrayList<Integer> inorder,int is,int ie,
                                                 ArrayList<Integer> preorder,int ps,int pe,
                                                 Map<Integer,Integer> posMap)
    {
        if(is > ie || ps > pe)
            return null;
        //Starting node of preorder is the root itself
        TreeNode root = new TreeNode(preorder.get(ps));
        int rootPosInorder = posMap.get(root.val);
        int numElementLeft = rootPosInorder - is;

        root.left = buildTreeRecursively(inorder,is,rootPosInorder - 1,
                preorder,ps + 1,ps + numElementLeft - 1,posMap);

        root.right = buildTreeRecursively(inorder,rootPosInorder + 1,ie,
                                        preorder,ps + numElementLeft + 1,pe,posMap);

        return root;
    }
    public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> preorder) {

        if (inorder.isEmpty() || preorder.isEmpty() || inorder.size() != preorder.size())
            return null;

        Map<Integer,Integer> posMap = new HashMap<>();
        for (int i = 0;i<inorder.size();i++)
            posMap.put(inorder.get(i),i);

        return buildTreeRecursively(inorder,0,inorder.size() - 1,preorder,0,preorder.size() - 1,posMap);
    }*/
}
