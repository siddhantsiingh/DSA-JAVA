package Queue;

import LinkedList.LinkedList;

class StackUsingQueue {

    public void push(int x, Queue<Integer> q1) {
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }

    }

    ////
    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        int val = q1.remove();
        return val;
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    public boolean empty() {
        if (q1.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Queue<Integer> q1 = new LinkedList<>();
    }
}