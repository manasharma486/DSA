import linkedlist.*;
public class LengthOfLoopLinkedList {
    
    public static void main(String[] args) {
        
        Integer[] arr = {1,2,3,4,5};
        Node<Integer> head = ll(arr);
        
        System.out.println(lengthOfLoop(head));
    }
    
    private static Node<Integer> ll (Integer[] arr){

        Node<Integer>Head = new Node<Integer>(arr[0]);
        Node<Integer>iterator = Head;
         Node<Integer> lol = null;

        for (int i = 1; i < arr.length; i++) {
            Node<Integer>temp = new Node<Integer>(arr[i]);

            if (i == arr.length-3){
                 lol = temp ;
            }

            iterator.next = temp;
            iterator = iterator.next;

        }

        iterator.next = lol ;

        

        return Head;
    
    }

    private static int lengthOfLoop(Node<Integer> head){

        int count = 0 ;
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count ++ ; // this will give me the distance from head to the point at which slow and head will collide
            if (slow == fast){
                

                return count;
            }
        }


        return 0 ;
        
        
    }
}

