package BinaryTrees;

import java.util.*;

public class LevelOrder {
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

        public static void levelOrder(Node root, int k) {
            if (root == null || k < 1) {
                System.out.println("Invalid input: The tree is empty or k is not valid.");
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            int level = 1;
            while (!q.isEmpty()) {
                Node curNode = q.remove();

                // Handle null node, which indicates the end of a level
                if (curNode == null) {
                    level++;
                    if (level == k) {
                        // Print the elements at the kth level
                        System.out.println();
                        return;
                    }
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                        continue;
                    }
                }

                // If we reach the desired level, print the element and return
                if (level == k) {
                    System.out.print(curNode.data + " ");
                    return;
                }

                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }

            // If the loop finishes without finding the desired level, it means
            // the tree has fewer than k levels.
            System.out.println("The tree has fewer than " + k + " levels.");
        }
    }

    // TC: O(N)
    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.binaryTree(nodes);
        System.out.println(root.data);

        bt.levelOrder(root, 3);
    }
}
