import java.util.HashMap;
import java.util.Map;

import linkedlist.*;
public class ReturnTheNodeWhereCycleBeginsLC142 {
    public static void main(String[] args) {
        Integer[] arr = {3,4,5,2,1};
        Node<Integer>Head = ll(arr);


        Node<Integer> loopHead = detectLoop(Head);

        System.out.println(loopHead.data);

        
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

    // Not Optimal 

    private static Node<Integer> beginLoop (Node<Integer> head){
        Node<Integer> temp = head ;
        Map<Node<Integer> , Integer> map = new HashMap<>();

        while(temp != null){
            map.put(temp , map.getOrDefault(temp, 0)+ 1);

            if (map.get(temp) > 1) {
                return temp;
            }

            temp = temp.next;
        }

        return head;
    }

    // Optimal tortoise hare Method


    private static Node<Integer> detectLoop(Node<Integer> head){

        Node<Integer> fast = head;
        Node<Integer> slow = head;

        while(fast != null  && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                slow = head ;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;


            }

        }

        return null;
    }

}
