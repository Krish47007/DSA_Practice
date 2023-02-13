package tree;

public class Kth_Ancestor_of_a_Tree_Node {

    class TreeAncestor {

        private int[] parent;
        private int n;

        public TreeAncestor(int n, int[] parent) {

            this.n = n;
            this.parent = parent;
        }

        public int getKthAncestor(int node, int k) {

            int ans = -1;

            while (k-- > 0)
            {
                ans = parent[node];
                node = ans;
            }

            return ans;
        }
    }
}
