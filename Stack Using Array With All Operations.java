import java.util.ArrayList;

//Stack Using Array
public class StackUsingArray {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int popped = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return popped;
        }

        // peek transverse the data
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(7);
            s.push(78);
            s.push(25);

            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
    }
}
