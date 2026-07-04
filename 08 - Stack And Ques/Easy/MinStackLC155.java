import java.util.Stack;

public class MinStackLC155 {
    
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin());

        minStack.pop();

        System.out.println(minStack.top());
        System.out.println(minStack.getMin());


    }


}


class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack; 

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    
    public void push(int value) {
        if (stack.size() == 0) {
           
            minStack.push(value);
        }
        
        else {
            if (minStack.peek() >= value) {
                minStack.push(value);
            }
        }

         stack.push(value);
    }
    
    public void pop() {

        if (minStack.peek() == stack.peek()) {
            minStack.pop();
        }

        stack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        return minStack.peek();
    }
}

