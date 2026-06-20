import linkedlist.*;
public class LinkedListCycleLC141 {
    
    public static void main(String[] args) {
         Integer[] arr = {3,2,0,-4};

    Node<Integer> Head = ll(arr);
    LinkedListUtils.printSinglyLinkedList(Head);
    }

    private static Node<Integer> ll (Integer[] arr){

        Node<Integer>Head = new Node<Integer>(arr[0]);
        Node<Integer>iterator = Head;

        for (int i = 1; i < arr.length; i++) {
            Node<Integer>temp = new Node<Integer>(arr[i]);

            iterator.next = temp ;
            iterator = iterator.next;
        }

        iterator.next = Head;

        return Head;
    
    }

}
