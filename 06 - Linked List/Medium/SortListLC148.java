import linkedlist.*;
public class SortListLC148 {
    
    public static void main(String[] args) {
        
        Integer[] arr = {5,4,3,2,1};

        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);

        head = sort(head);

        LinkedListUtils.printSinglyLinkedList(head);
    }

    private static Node<Integer> sort(Node<Integer> head ) {

        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> mid = midNode(head);

        Node<Integer> head2 = mid.next ;

        mid.next = null ;

       head =  sort(head);
        head2 =sort(head2);


        return merge(head, head2);


    }

    private static Node<Integer> merge (Node<Integer> head1 , Node<Integer> head2) {
        
        Node<Integer> head = new Node<Integer>(-121245 );
        Node<Integer> dummyNode = head ;

        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;

        while(temp1 != null && temp2 != null) {

            if (temp1.data > temp2.data) {
                dummyNode.next = temp2 ;
                dummyNode = dummyNode.next ;
                temp2 = temp2.next;
            }

            else if (temp1.data <  temp2.data) {
                dummyNode.next =  temp1;
                dummyNode = dummyNode.next;

                temp1 = temp1.next;
            }

            else {
                dummyNode.next = temp1 ;
                dummyNode = dummyNode.next;

                dummyNode.next = temp2 ;
                dummyNode = dummyNode.next;

                temp1 = temp1.next;
                temp2 = temp2.next;

            }
        }


        while (temp1 != null) {
            dummyNode.next = temp1 ;
            dummyNode = dummyNode.next;
            temp1 = temp1.next;
        }

         while (temp2 != null) {
            dummyNode.next = temp2 ;
            dummyNode = dummyNode.next;
            temp2 = temp2.next;
        }

        return head.next;
    }

    private static Node<Integer> midNode (Node<Integer> head) {
        Node<Integer> fast = head.next ;
        Node<Integer> slow = head ;

        while(fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next;
        }

        return slow ;
    }

}
