import linkedlist.*;
public class DeleteMiddleNodeLC2095 {
    
    public static void main(String[] args) {
        Integer[] arr  = {1,3,4,7,1,2,6};

        Node<Integer>head = LinkedListUtils.arrToSinglyLinkedList(arr);

        head = deleteMid(head);

        LinkedListUtils.printSinglyLinkedList(head);
    }

    private static Node<Integer> deleteMid (Node<Integer> head){
        Node<Integer> slow = head ;
        Node<Integer> prvSlow = null ;
        Node<Integer> fast = head ;


        while(fast != null && fast.next != null) {

            prvSlow = slow ;
            slow = slow.next ;
            fast = fast.next.next;
        }

        prvSlow.next = slow.next;

        return head;

    }


}


