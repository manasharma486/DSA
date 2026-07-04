

public class QueueusingArrays {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new Queue(10);

        for (int i = 1; i < 10; i++) {
            queue.push(i);
        }

        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println(queue.top());

        queue.push(45);
        queue.push(35);
        queue.push(65);
        queue.push(65);

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
         queue.pop();

        System.out.println(queue.size);
        System.out.println(queue.top());
    }
}

class Queue<T> {

    Object[] arr;

   
    private int start = -1 ;
    private int end  = -1 ;
    private int capacity ;

    public int size = 0 ;

    Queue(int capacity) {
        arr = new Object[capacity];
        this.capacity = capacity;
    }

    public void push(T data) {

        if (capacity == size) {
            throw new RuntimeException("Queue Capacity reached");
        }

        
        if (size == 0 && start == -1 && end == -1) {
            start = 0 ;
            end = 0 ;
        }

        else {
            end = (end + 1) % capacity ;
        }
        
        arr[end] = data ;
        size ++ ;



     }

     public void pop() {

        if (size == 0) {
            throw new RuntimeException("No Elements To PoP");
        }

        if (size == 1) {
            end = -1 ;
            start = -1;
        }

        else {
            start = (start + 1 ) % capacity ;
            
        }

        size -- ;

        
     }
     
     public T top() {
        if (size == 0) {
            throw new RuntimeException("No Elements Present");
        }

        return (T) arr[start];
     }
}
