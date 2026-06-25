import linkedlist.*;


public class RemoveNthNodeFromLastLC19 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);


        head = removeNodeFromLast(head, 4);

        LinkedListUtils.printSinglyLinkedList(head);
    }

    private static Node<Integer> removeNodeFromLast(Node<Integer> head , int pos) {

        // removal of tail 

        if (pos == 1) {
            Node<Integer> temp = head ;

            while(temp.next.next != null ) {
                temp = temp.next ;
            }

            temp.next = null ;


            return head ;
        }



        int length =  fastLen(head);

        int nodeRm  = (length - pos) + 1 ;


        if (nodeRm == 1) {
            return head = head.next ;
        }


        Node<Integer> temp = head ;

        for (int i = 1 ; i < nodeRm-1 ; i++) {
            temp =  temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    private static int fastLen (Node<Integer> head ) {
        int count  = 1 ;
        Node<Integer> fast  = head ;
        while(fast != null && fast.next != null) {
            fast = fast.next.next ;
            count += 2 ;
        }

        if (fast == null) {
            count = count - 1 ;
        }

        return count ;
    }
}
