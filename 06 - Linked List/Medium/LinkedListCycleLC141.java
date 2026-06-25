import java.util.HashMap;
import java.util.Map;

import linkedlist.*;
public class LinkedListCycleLC141 {
    
    public static void main(String[] args) {
         Integer[] arr = {3,2,0,-4};

    Node<Integer> Head = ll(arr);
        
        System.out.println(loopDetect(Head));
    }

    private static Node<Integer> ll (Integer[] arr){

        Node<Integer>Head = new Node<Integer>(arr[0]);
        Node<Integer>iterator = Head;

        for (int i = 1; i < arr.length; i++) {
            Node<Integer>temp = new Node<Integer>(arr[i]);

            iterator.next = temp ;
            iterator = iterator.next;
        }

        iterator.next = Head;

        return Head;
    
    }

    // Not optimal

    private static boolean detectCycle(Node<Integer> Head){
        
        Map<Node<Integer> , Integer >map = new HashMap<>();

        Node<Integer>temp = Head;

        while(temp != null){

            map.put(temp, map.getOrDefault(temp,0)+1);
            

            if (map.get(temp) > 1) {
                return true;
            }

            temp = temp.next;
        }

        return false;
        

    }

    private static boolean loopDetect(Node<Integer>head){
        Node<Integer>slow = head ;
        Node<Integer>fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;
    }

}
