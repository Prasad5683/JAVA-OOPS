import java.util.Stack;

class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        // Printing the stack
        System.out.println("Stack: " + stack);
        
        // Popping elements from the stack
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        
        // Peeking the top element
        System.out.println("Top element of the stack: " + stack.peek());
    }
}
