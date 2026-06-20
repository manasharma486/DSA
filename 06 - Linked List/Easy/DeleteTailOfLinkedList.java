import linkedlist.LinkedListUtils;
import linkedlist.Node;

public class DeleteTailOfLinkedList {
    
    public static void main(String[] args) {
        Integer[] arr = {35,22,66,12,20};
        Node <Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);
     
        LinkedListUtils.printSinglyLinkedList(head);

        head = removeTail(head);
         
        LinkedListUtils.printSinglyLinkedList(head);
        
    }

    private static <T> Node<T> removeTail(Node<T> head){

        if (head.next == null || head == null ){
            return head;
        }
       
        Node<T> temp = head;
        
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;

        return head;

    }
}
