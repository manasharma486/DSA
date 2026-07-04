import java.util.Stack;

public class QueueUsingStackLC3232 {
    
    public static void main(String[] args) {
        MyQueue q = new MyQueue() ;

        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        q.print();

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

        q.print();
    }
}

class MyQueue {

    Stack<Integer> stack ;
    Stack <Integer> prvEm ;
    public MyQueue() {
        stack = new Stack<>();
        prvEm = new Stack<>();
    }
    
    public void push(int x) {
        
        
        
       stack.push(x);

       prvEm.removeAllElements();


    for (int i = stack.size() - 1; i >= 0; i--) {
        prvEm.push(stack.get(i));
    }

      

    }
    
    public int pop() {
        return prvEm.pop();
    }
    
    public int peek() {
        return prvEm.peek();
    }
    
    public boolean empty() {
        return prvEm.isEmpty();
    }

    public void print() {
        System.out.println(prvEm);
    }
}

