package BinaryTrees;

public class InOrder {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node binaryTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = binaryTree(nodes);
            newNode.right = binaryTree(nodes);

            return newNode;

        }

        public static void inorderTraversal(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data);
            inorderTraversal(root.right);
        }
    }

    // TC: O(N) time
    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.binaryTree(nodes);
        System.out.println(root.data);

        bt.inorderTraversal(root);
    }
}
