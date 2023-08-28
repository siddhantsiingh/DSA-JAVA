package BinaryTrees;

public class Diameter {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int height(Node root) {

        if (root == null) {
            return 0;
        }

        int leftH = height(root.left);
        int rightH = height(root.right);
        int ht = Math.max(leftH, rightH) + 1;

        return ht;

    }

    public static int diameter1(Node root) { // O(N^2)- height n node-n nodes visit
        if (root == null) {
            return 0;
        }

        int leftD = diameter1(root.left);
        int rightD = diameter1(root.right);
        int leftH = height(root.left);
        int rightH = height(root.right);
        int currDia = leftH + rightH + 1;

        return Math.max(currDia, Math.max(leftD, rightD));

    }

    static class Info {
        int dia;
        int ht;

        public Info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root) { // O(N)
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diameter = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diameter, height);

    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);
        System.out.println(diameter1(root));
        System.out.println(diameter2(root).dia);
    }
}
