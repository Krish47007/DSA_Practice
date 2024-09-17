package advance.day_47_trees_2_views_types.assignment;

import advance.day_45_tree_basics.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Binary_Tree_From_Inorder_And_Postorder {


    private static TreeNode buildTreeRecursively(ArrayList<Integer> inorder,int is,int ie,
                                                 ArrayList<Integer> postorder,
                                                 int ps,int pe,Map<Integer,Integer> posMap
                                                 )
    {
        //Base case
        if(is > ie || ps > pe)
            return null;

        //Last node in postorder is the root
        TreeNode root = new TreeNode(postorder.get(pe));
        //check pos of root in inorder
        int inRootPos = posMap.get(postorder.get(pe));
        int numElementLeft = inRootPos - is;

        root.left = buildTreeRecursively(inorder,is,inRootPos - 1,
                                        postorder,
                                        ps,
                                    ps + numElementLeft - 1,
                                        posMap
                                        );

        root.right = buildTreeRecursively(inorder,inRootPos + 1,ie,
                                            postorder,
                                            ps + numElementLeft,
                                            pe - 1,
                                            posMap
                                         );
        return root;
    }
    public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {

        if (inorder.isEmpty() || postorder.isEmpty() || inorder.size() != postorder.size())
            return null;

        Map<Integer,Integer> posMap = new HashMap<>();
        for (int i = 0;i<inorder.size();i++)
            posMap.put(inorder.get(i),i);

       return buildTreeRecursively(inorder,0,inorder.size() - 1,postorder,0,postorder.size() - 1,posMap);


    }
}
