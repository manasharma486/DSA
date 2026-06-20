import linkedlist.*;;

public class MiddleOfTheLinkedListLC876 {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        Node<Integer>Head = LinkedListUtils.arrToSinglyLinkedList(arr);

        Node<Integer>midHead = midNode(Head);
        LinkedListUtils.printSinglyLinkedList(Head);
        LinkedListUtils.printSinglyLinkedList(midHead);
        
    }


    private static Node<Integer>middleHead(Node<Integer> head){

        int length = LinkedListUtils.length(head);

        Node<Integer>temp = head;

        for (int i = 1; i < (length)/2; i++) {
            temp = temp.next;
        }

        return temp.next;
    }

    //tortoise HAre Method 

    private static Node<Integer>midNode(Node<Integer>head){
        Node<Integer> slow = head ;
        Node<Integer> fast = head ;

        while( fast != null && fast.next != null){           // in the even case when the Length is even , our fast will point to the last element and our slow will point to the MID element , IN the odd case , fast will points to null and slow will points to the econd mid;
            slow = slow.next;
            fast = fast.next.next;
        }


        return slow;
    }
    
}
