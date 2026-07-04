import linkedlist.*;
public class QueueUsingLinkedList {
    
    public static void main(String[] args) {

        Queue<Integer> qu = new Queue<Integer>();

        for (int i = 0; i < 5; i++) {
            
            qu.push(22*9*i);
        }

        qu.print();
        qu.pop();
        qu.pop();
             qu.pop();
        qu.pop();
  
        qu.push(45);
        
        
        System.out.println(qu.top());
        qu.print();
        
    }
}

class Queue<T> {

    private Node<T> head = new Node<T>(null);
    private Node<T> temp = head;

    public int size = 0 ;

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);

        temp.next = newNode;
        temp = newNode;

        size ++ ;

        if (size == 1) {
            head = temp;
        }

    }

    public void pop() {

        if (size == 0) {
            throw new RuntimeException("No Elements to Pop");
        }
        
        head = head.next;
        size -- ;
    }

    public T top() {
        if (size == 0) {
            throw new RuntimeException("No Elements present");
        }
        return head.data;
    }

    public void print() {

        if (size == 0) {
            throw new RuntimeException("No Elements present");
        }
        LinkedListUtils.printSinglyLinkedList(head);
    }

}
