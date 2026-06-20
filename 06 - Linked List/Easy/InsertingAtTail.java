import linkedlist.*;
public class InsertingAtTail {
    public static void main(String[] args) {
        Integer[]arr = {2,4,5,6,8,9,12,21};
        Node<Integer>head = LinkedListUtils.arrToSinglyLinkedList(arr);

        head = null;
        head = insertTail(head, 65);
        LinkedListUtils.printSinglyLinkedList(head);
    }

    private static <T> Node<T> insertTail(Node<T> head , T element){
        if (head == null){

            return new Node<T>(element);
        }

        Node<T> temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }

        Node<T> newNode = new Node<T>(element);
        temp.next = newNode;

        return head;

    }
}
