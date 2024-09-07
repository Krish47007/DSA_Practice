package advance.day_45_tree_basics.classroom;

import advance.day_45_tree_basics.Node;

public class PreOrder_Traversal {

    public static void preorder(Node root)
    {
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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

        preorder(root);
    }
}
