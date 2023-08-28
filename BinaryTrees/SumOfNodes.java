package BinaryTrees;

public class SumOfNodes {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int SumofNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int leftS = SumofNodes(root.left);
        int rightS = SumofNodes(root.right);
        int sum = leftS + rightS + root.data;

        return sum;

    }

    // TC: O(N)
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(SumofNodes(root));
    }
}
