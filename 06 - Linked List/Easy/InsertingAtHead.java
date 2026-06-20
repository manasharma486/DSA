import linkedlist.*;
public class InsertingAtHead {
    public static void main(String[] args) {
        Integer[]arr = {2,4,5,6,8,9,12,21};
        Node<Integer>head = LinkedListUtils.arrToSinglyLinkedList(arr);
        LinkedListUtils.printSinglyLinkedList(head);

        head = insertNewHead(head , 758);

        LinkedListUtils.printSinglyLinkedList(head);
    }
    private static <T> Node<T> insertNewHead(Node<T> head , T element){

        Node<T>temp = new Node<T>(element);
        temp.next = head;

        return temp;
    }
}
