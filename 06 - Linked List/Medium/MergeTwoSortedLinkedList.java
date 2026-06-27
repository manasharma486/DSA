import linkedlist.*;
public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        Integer[] arr1 = {2,3,4,5,12,16};
        Integer[] arr2 = {1,6,7,8,15,21,45};

        Node<Integer> head1 = LinkedListUtils.arrToSinglyLinkedList(arr1);
        Node<Integer> head2 = LinkedListUtils.arrToSinglyLinkedList(arr2); 

        Node<Integer> head3 = merge(head1 , head2);

        LinkedListUtils.printSinglyLinkedList(head3);
    }

    private static Node<Integer> merge (Node<Integer> head1 , Node<Integer> head2 ) {
        Node<Integer> temp = new Node<Integer>(-1);
        
        Node<Integer> dummyNode = temp;

        Node<Integer> temp1 = head1 ;
        Node<Integer> temp2 = head2 ;

        while (temp1 != null && temp2 != null) {
            if (temp1.data > temp2.data) {
                dummyNode.next = temp2 ;
                dummyNode = dummyNode.next;
                temp2 = temp2.next ;
               
            }

            else if (temp1.data < temp2.data) {
                dummyNode.next = temp1;
                dummyNode = dummyNode.next;

                temp1 = temp1.next;

            }

            else {
                dummyNode.next = temp1;
                dummyNode = dummyNode.next;

                dummyNode.next = temp2;
                dummyNode = dummyNode.next;
                
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            

            

        }

        // if the remaining elements presents


             while (temp1 != null) {
                dummyNode.next = temp1;
                dummyNode = dummyNode.next;
                temp1 = temp1.next;
            }

            while (temp2 != null) {
                dummyNode.next = temp2;
                dummyNode = dummyNode.next;
                temp2 = temp2.next;
            }

        return temp.next;
    }
}
