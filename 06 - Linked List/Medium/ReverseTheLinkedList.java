import linkedlist.*;
public class ReverseTheLinkedList {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);

        LinkedListUtils.printSinglyLinkedList(head);

        Node<Integer>Hrev = revInplace(head);

        LinkedListUtils.printSinglyLinkedList(Hrev);
    }

    // Not an Inplace Solution
    
    private static Node<Integer> rev(Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }
        Node<Integer>temp = head;
        Node<Integer>prv = null;

        while(temp != null) {
            Node<Integer>revNodes = new Node<Integer>(temp.data);
            revNodes.next = prv ;

            prv = revNodes;
            temp = temp.next;

        }

        return prv;
    }

    private static Node<Integer> revInplace (Node<Integer> head){

        if (head == null || head.next ==  null){
            return head;
        }

        Node<Integer>prv = null ;
        Node<Integer>temp = head ;

        while(temp != null){
            Node<Integer> next = temp.next;

            temp.next = prv;
            prv = temp;

            temp = next;
        }

       

        return prv;
    }
    
}
