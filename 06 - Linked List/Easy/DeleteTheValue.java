import linkedlist.*;

public class DeleteTheValue {
    public static void main(String[] args) {
        Integer[] arr ={96,45,75,85,12,34,69};
        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);

        LinkedListUtils.printSinglyLinkedList(head);
        LinkedListUtils.printSinglyLinkedList(removeByVal(head, 100));
        
    }
    private static <T> Node<T> removeByVal(Node<T> head , T val){
        if (head.data == val){
            return head.next;
        }

        else if (head == null || head.next == null){
            return head;
        }

        Node<T> temp = head;
        while(temp!= null){

            if (temp.next != null && temp.next.data == val){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head ;
    }
}
