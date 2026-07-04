import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueLC225 {
    
    public static void main(String[] args) {
        
        MyStack sc = new MyStack();

        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);

        sc.print();
    }
}

class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        
       queue  = new LinkedList<>();

    }
    
    public void push(int x) {

        int s = queue.size();

        queue.add(x) ;

       

        for (int i = 1; i <= s; i++) {
            
            queue.add(queue.peek());
            queue.poll();
        }
    
        
    }
    
    public int pop() {
        
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }

    public void print() {
        System.out.println(queue);
    }
}
