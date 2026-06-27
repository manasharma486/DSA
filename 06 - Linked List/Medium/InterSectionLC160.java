import java.util.HashSet;
import java.util.Set;

import linkedlist.*;
public class InterSectionLC160 {
    public static void main(String[] args) {
        
        Integer[] arr = {4,1};
        Integer[] arr2 = {5,6,1};
        Integer[] arr3 = {8,4,5};

        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr3);

        Node<Integer> head1 = LinkedListUtils.arrToSinglyLinkedList(arr);
        Node<Integer> tail1 = tail(head1);
        tail1.next = head;

        Node<Integer> head2 = LinkedListUtils.arrToSinglyLinkedList(arr2);
        Node<Integer> tail2 = tail(head2);
        tail2.next = head;



        LinkedListUtils.printSinglyLinkedList(head1);
        LinkedListUtils.printSinglyLinkedList(head2);
        
        System.out.println(itersectionNode(head1, head2).data);
    }

    private static Node<Integer> itersectionNode (Node<Integer> head1 , Node<Integer> head2) {

        if (head1 ==  null || head2 == null) {
            return null;
        }
        Set<Node<Integer>> set = new HashSet<>();

        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;

        while(temp1 != null) {
            set.add(temp1);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            if (set.contains(temp2)) {
                return temp2 ;
            }
            temp2 = temp2.next;
        }

        return null;

    }

    private static Node<Integer> tail (Node<Integer> head) {

        Node<Integer> temp = head ;

        while(temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }
}
