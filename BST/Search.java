package BST;

public class Search {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } else if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);

    }

    public static void main(String args[]) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        {
            root.left.left = new Node(1);
            root.left.right = new Node(3);
            root.right.right = new Node(6);
        }
        System.out.println(search(root, 4));// TC- O(H-height) - Height= log N = balanced tree, Worst case scenario-
                                            // O(N)- Skewed tree

    }
}
