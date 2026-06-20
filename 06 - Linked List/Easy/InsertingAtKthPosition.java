import linkedlist.LinkedListUtils;
import linkedlist.Node;

public class InsertingAtKthPosition {
    public static void main(String[] args) {
        Integer[]arr = {2,4,5,6,8,9,12,21};
        Node<Integer>head = LinkedListUtils.arrToSinglyLinkedList(arr);

        head = insertAtKth(head, 26, 20);
        LinkedListUtils.printSinglyLinkedList(head);
    }

    private static <T> Node<T> insertAtKth(Node<T> head , T element , int pos){
        if (head == null ){
            return new Node<T>(element);
        }

        if (pos <= 0){
            return head;
        }

        if (pos == 1){

            Node<T> temp = new Node<T>(element);
            temp.next = head;

            return temp;
        }


        Node<T> temp = head;
        for (int i = 1 ; i < pos-1 && temp.next != null; i++) {
            
            temp = temp.next;
        }

        Node<T> newNode = new Node<T>(element);
        newNode.next = temp.next;

        temp.next = newNode;


        return head;

    }
}
