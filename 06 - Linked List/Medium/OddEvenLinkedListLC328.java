import java.util.ArrayList;

import java.util.List;
import linkedlist.*;
public class OddEvenLinkedListLC328 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);
        head = oddEvenGroupLL(head);

        LinkedListUtils.printSinglyLinkedList(head);
    }

    private static Node<Integer> oddEvenLL (Node<Integer> head){

        if (head.next == null || head == null || head.next.next == null){
            return head;
        }

        Node<Integer> fast  = head;

        Node<Integer> prvFast = null;

        List<Node<Integer>> arr = new ArrayList<>();

        // odd indices grouped 
        while(fast != null && fast.next != null){

            
            arr.add(fast.next);
            fast.next = fast.next.next;
            prvFast = fast;
            fast = fast.next;
        }

        if (fast == null){
            fast = prvFast;
        }

        arr.add(null);

        for (int i = 0; i < arr.size(); i++) {
            fast.next = arr.get(i);
            fast = fast.next;

        }



        return head ;
    }

    private static Node<Integer> oddEvenGroupLL(Node<Integer> head){
        Node<Integer> odd = head;
        
        Node<Integer> even = head.next;
        Node<Integer> firstEven = even;

        while(odd != null && odd.next != null && even.next != null){

            
            odd.next  = even.next ;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = firstEven;

        return head;
    }
}
