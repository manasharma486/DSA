import linkedlist.LinkedListUtils;
import linkedlist.Node;

public class DeleteKthElement {
    
    public static void main(String[] args) {
        
        Integer[] arr = {96,45,75,85,12,34,69};

        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);

        LinkedListUtils.printSinglyLinkedList(head);

        head = removeElement(head, 7);

        LinkedListUtils.printSinglyLinkedList(head);

        
    }

    private static <T> Node <T> removeElement(Node<T> head , int num){
    

        if ( num <= 0) {
            return head;
        }

       else if (num == 1){
            Node <T> temp = head ;
            head = temp.next;
            return head; 
        }

        
        Node<T> temp = head;

        for (int i = 1; i < num-1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null){
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }
}
