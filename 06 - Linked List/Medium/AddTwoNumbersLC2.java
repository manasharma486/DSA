import linkedlist.*;
public class AddTwoNumbersLC2 {
    public static void main(String[] args) {
        
        Integer[] arr = {2,4,3};
        Integer[] arr2 = {5,6,4};

        Node<Integer> head1 = LinkedListUtils.arrToSinglyLinkedList(arr);
        Node<Integer> head2 = LinkedListUtils.arrToSinglyLinkedList(arr2);

        Node<Integer> head = numLinkedList(returnSum(head2) + returnSum(head1));

        LinkedListUtils.printSinglyLinkedList(head);
        
    }

    private static long returnSum(Node<Integer> head) {
        long sum = 0 ;
        Node<Integer> temp = head;
        while (temp != null) {
            sum*=10;
            sum+= temp.data;
            temp = temp.next;
        }

        return sum;

    }

    private static Node<Integer> numLinkedList(long num) {
        Node<Integer> prv = null;
        while (num != 0) {
            Node<Integer> temp = new Node<Integer>((int)(num%10));
            temp.next = prv;
            prv = temp;

            num/= 10 ;

        }

        return prv;
    }
}
