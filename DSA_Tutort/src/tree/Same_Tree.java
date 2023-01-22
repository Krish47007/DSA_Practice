package tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Same_Tree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if( p == null && q == null)
            return true;
        //If nodes of the trees dont exist
        else if((p!= null && q == null) || (p == null && q != null))
            return false;
        //If left and right half of the both trees are not same
        else if(p.val != q.val)
            return false;
        else
        {
            boolean lhalf = isSameTree(p.left,q.left);

            //If left half of the both trees are not same
            if(lhalf == false)
                return false;

            boolean rhalf = isSameTree(p.right,q.right);

            //If right half of the both trees are not same
            if(rhalf == false)
                return false;

            return lhalf == rhalf;

        }

    }
}
