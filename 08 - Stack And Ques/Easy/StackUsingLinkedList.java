import linkedlist.*;

public class StackUsingLinkedList {
    
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<> () ;

        for (int i = 1 ; i <= 5 ; i++) {
            sc.push(i*23);
        }

        sc.print();

        sc.pop();
        

        sc.pop();
        
        sc.print();

        System.out.println(sc.top());
 

        System.out.println(sc.size);


    }

    
}

class Stack<T> {
    public int size = 0 ;
    private Node<T> top = null;


    public void push (T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = top ;
        top = newNode;
        size ++ ;
    }

    public T top () {
        if (size == 0) {
            throw new RuntimeException("No elements present");
        }
        return top.data ;
    }

    public void pop() {

        if (size == 0) {
            throw new RuntimeException("No elements to Pop");
        }

        else {
            
            top = top.next;
            size-- ;

        }
    }

    public void print () {
        if (size == 0) {
            throw new RuntimeException("Nothing to print");
        }
        LinkedListUtils.printSinglyLinkedList(top);
    }

    

}
