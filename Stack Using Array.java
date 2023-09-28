public class SimpleStack {
    private static final int MAX_SIZE = 5;  // Maximum size of the stack
    private String[] stackArray;            // Array to store stack elements
    private int top;                        // Index of the top element

    // Constructor to initialize the stack
    public SimpleStack() {
        stackArray = new String[MAX_SIZE];
        top = -1;  // Initialize top to -1, indicating an empty stack
    }

    // Method to push an element onto the stack
    public void push(String item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack overflow. Cannot push element: " + item);
        } else {
            stackArray[++top] = item;
            System.out.println(item + " pushed to the stack");
        }
    }

    // Method to pop an element from the stack
    public String pop() {
        if (top == -1) {
            System.out.println("Stack underflow. Cannot pop from an empty stack");
            return null;
        } else {
            String poppedItem = stackArray[top--];
            System.out.println(poppedItem + " popped from the stack");
            return poppedItem;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();

        stack.push("Suraj");
        stack.push("t");
        stack.push("p");
        stack.push("oop");
        stack.push("u");

        System.out.println("Is the stack empty? " + stack.isEmpty());

        while (!stack.isEmpty()) {
            stack.pop();
        }

        // Attempting to pop from an empty stack
        stack.pop();
    }
}
