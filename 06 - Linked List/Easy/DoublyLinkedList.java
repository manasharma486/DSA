import linkedlist.*;
public class DoublyLinkedList {
    public static void main(String[] args) {
        Integer[] arr = {25,45,12,63,85,96,100};

        Node<Integer> Head = arrToDoublyLL(arr)[0];
        Node<Integer>Tail = arrToDoublyLL(arr)[1];

        
      
        
        LinkedListUtils.printSinglyLinkedList(Head);

        
        Head  = reverse(Tail);
        LinkedListUtils.printSinglyLinkedList(Head);

    }

    private static Node[] arrToDoublyLL (Integer[] arr){
        Node<Integer> Head = new Node<Integer>(arr[0]);
        Node<Integer> iterator = Head;
        for (int i = 1; i < arr.length; i++) {
            
            Node<Integer> newNode = new Node<Integer>(arr[i]);

            newNode.previous = iterator;

            iterator.next = newNode;

            iterator = iterator.next;


        }
        
        return new Node[] {Head , iterator};
    }

    private static Node<Integer> reverse (Node<Integer> tail){
        if (tail == null || tail.previous == null){
            return tail;
        }
        Node<Integer> temp1 = tail ;
        Node<Integer> Head =  new Node<Integer>(tail.data);
        Node<Integer>temp2 = Head;
        
        while(temp1 != null) {

            temp2.next = temp1.previous;
            temp2.previous = temp1.next;

            temp2 = temp2.next;
            temp1 = temp1.previous;
        }

        return Head;
    }

    private static void printRev (Node<Integer> tail){
        Node<Integer>temp = tail;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
    }
}
