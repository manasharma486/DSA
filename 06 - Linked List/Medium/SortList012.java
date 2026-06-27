import linkedlist.*;
public class SortList012 {

    public static void main(String[] args) {
        
        Integer[] arr = {1,2,2,0,1,0};
        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);

        head = sort(head);
        LinkedListUtils.printSinglyLinkedList(head);
    }

    private static Node <Integer> sort (Node<Integer> head) {
        Node<Integer> head0 = new Node<Integer>(1);
        Node<Integer> head1 = new Node<Integer>(1);
        Node<Integer> head2 = new Node<Integer>(1);


        Node<Integer> dummuNode0 = head0;
        Node<Integer> dummuNode1 = head1;
        Node<Integer> dummuNode2 = head2;


        Node<Integer> temp = head ;

        while(temp != null) {

            if (temp.data == 0) {

                dummuNode0.next = temp;
                dummuNode0 = dummuNode0.next;
            }

            else if (temp.data == 1) {
                dummuNode1.next = temp;
                dummuNode1 = dummuNode1.next;
            }

            else {
                dummuNode2.next = temp;
                dummuNode2 = dummuNode2.next;
            }

            temp = temp.next;
        }


        dummuNode0.next = head1.next ;
        dummuNode1.next = head2.next ;
        dummuNode2.next = null;

        return head0.next;
    } 


}
