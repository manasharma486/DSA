import linkedlist.*;
public class SortListLC148 {
    
    public static void main(String[] args) {
        
        Integer[] arr = {5,4,3,2,1};

        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);
    }

    private static void sort(Node<Integer> head ) {

        if (head == null || head.next == null) {
            return;
        }

        Node<Integer> mid = midNode(head);

        Node<Integer> head2 = mid.next ;

        mid.next = null ;

        sort(head);
        sort(head2);


        merge(head, head2);


    }

    private static void merge (Node<Integer> head , Node<Integer> head2) {

        
    }

    private static Node<Integer> midNode (Node<Integer> head) {
        Node<Integer> fast = head ;
        Node<Integer> slow = head ;

        while(fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next;
        }

        return slow ;
    }

    private static Node<Integer> tailNode (Node<Integer> head) {
        Node<Integer> temp = head ;

        while (temp.next != null) {
            temp = temp.next ;
        }

        return temp;
    }
}
