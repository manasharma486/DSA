import linkedlist.*;
public class AddOneToAnumber {
    public static void main(String[] args) {
        
        Integer[] arr = {4,5,8};
        
        
        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);
        
        head = numPlusOne(head , 952);

        LinkedListUtils.printSinglyLinkedList(head);

        

    }

    private static Node<Integer> numPlusOne(Node<Integer> head , int num) {
        int sum = 0 ;

        Node<Integer> temp = head ;

        while(temp != null) {
            sum *= 10;
            sum += temp.data;

            temp = temp.next;
        }

        sum += num;

        

        temp = head;

        Node<Integer> prv = null ;

        while (temp != null) {
            
            int prvNum = sum%10 ;
            Node<Integer> nextNode = temp.next;

            temp.data = prvNum;
            temp.next = prv;

            prv = temp;
            

            sum /= 10 ;
            temp = nextNode;


        }

    

        while(sum != 0) {

            Node<Integer> newN = new Node<Integer>(sum%10);
            newN.next = prv;

            prv = newN;

            sum /= 10;
        }

        return prv;
    }
}
