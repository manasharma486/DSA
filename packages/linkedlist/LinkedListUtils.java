package linkedlist;

public class LinkedListUtils {
    
    public static <T> void  printSinglyLinkedList(Node<T> head){

        Node<T> temp = head ;

        System.out.print("{");

        while(temp != null) {
            System.out.print(temp.data );
            if (! (temp.next == null)){
                System.out.print(" , ");
            }
            temp = temp.next;
        }
        System.out.println("}");
    }
    public static <T> Node <T> arrToSinglyLinkedList(T[] arr) {
        Node<T> head = new Node<T>(arr[0]);
        Node<T> iterator = head;

        for (int i = 1; i < arr.length; i++) {
            
            iterator.next = new Node<T>(arr[i]);
            iterator = iterator.next;
        }


        return head;
    }

    public static <T> int length(Node<T> head){
        int count = 0 ;
        Node<T> temp = head;
        while(temp != null) {
            count++ ;
            temp = temp.next;
        }

        return count;
    } 
}
