import java.util.Stack;

import linkedlist.*;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Integer[] arr = {1,2,2,1};
        Node<Integer> head = LinkedListUtils.arrToSinglyLinkedList(arr);

        System.out.println(palindromeCheck(head));

        LinkedListUtils.printSinglyLinkedList(head);
       
    }

    // good solution can be more better , dont use stack !!

    private static boolean isPalindrome(Node<Integer> head){
        // condition for a single value
        if (head == null || head.next ==  null) {
            return true;
        }

        //Condition for a double value

        if (head.next.next == null) {
            if (head.data == head.next.data){
                return true;
            }
            return false;
        }


        Stack<Node<Integer>> stack = new Stack<> ();

        Node<Integer> slow = head ;
        Node<Integer> fast  = head;

        while(fast != null && fast.next != null){
            stack.push(slow);

            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null) // even length condition
        {
            fast = slow;
        }

        else{
            stack.push(slow);
            fast = slow;
        }
      

        boolean flag = false ;

        while(fast != null) {
            

            if (fast.data == (stack.pop().data)){
                flag = true;
            }
            else{
                return false;
            }

            fast = fast.next;
        }

        return flag;
     }

     // without stack 

     private static boolean palindromeCheck(Node<Integer> head){

        Node<Integer> copyHead = LinkedListUtils.copy(head);

        Node<Integer> fast = copyHead;
        Node<Integer> slow = copyHead;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node<Integer> mid = slow;

        slow = copyHead ;

        Node<Integer> prv = null ;
        Node<Integer> temp = mid ;
        
        while(temp != null){
            Node<Integer> nextNode = temp.next;

            temp.next = prv ;

            prv = temp;

            temp = nextNode;

        }

        fast = prv;

        

        while(slow.next != null && fast != null){

            if (! (slow.data == fast.data) ){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
     }
}
