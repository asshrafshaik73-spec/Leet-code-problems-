import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        q2.offer(x);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Removes the top element and returns it
    public int pop() {
        return q1.poll();
    }

    // Returns the top element
    public int top() {
        return q1.peek();
    }

    // Returns true if the stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);

        System.out.println(myStack.top());    // 2
        System.out.println(myStack.pop());    // 2
        System.out.println(myStack.empty());  // false
    }
}
