package BST;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);

        } else {
            root.right = insert(root.right, val);
        }

        return root;
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

    public static void main(String args[]) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        inorderTraversal(root);
    }
}
