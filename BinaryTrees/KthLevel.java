package BinaryTrees;

public class KthLevel {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int sum = 0;

    public static void kthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            sum += root.data;
            return;
        }

        kthLevel(root.left, level, k + 1);
        kthLevel(root.right, level, k + 1);

    }

    // O(N)
    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        kthLevel(root, 3, 1);
        System.out.println();
        System.out.println(sum);

    }
}
