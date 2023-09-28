public class StackUsingLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head = null;

        public static void push(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static Boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }

        public static void main(String args[]) {
            Stack stack = new Stack();
            stack.push(1);
            stack.push(8);
            stack.push(7);
            stack.push(6);

            while (!stack.isEmpty()) {
                System.out.println(stack.peek());
                stack.pop();
            }
        }
    }
}
