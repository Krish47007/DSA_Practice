package advance.day_45_tree_basics.classroom;

import advance.day_45_tree_basics.Node;

public class InOrder_Traversal {

    public static void inorder(Node root)
    {
        if(root == null)
            return;
        //Traverse left
        inorder(root.left);
        //Print current node data
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
                    10
                   /   \
                5        15
              /   \      /
             3     8    12

         */

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(8);
        root.right.left = new Node(12);

        inorder(root);
    }
}
