import linkedlist.Node;
public class ArrayToLinkedList {
    
    public static void main(String[] args) {
        Integer arr[] = {35,11,26,45,85,98,12,13,11,26};

        Node<Integer>arrH = ArrToLL(arr);

        printLL(arrH);
        System.out.println(lengthLL(arrH));

        insertElement(arrH, 9999);
        System.out.println("After Insertion");
        printLL(arrH);
    }

    private static <T> Node<T> ArrToLL(T[] arr){

        Node<T>Head = new Node<T>(arr[0]);
        Node<T>passer = Head;

        for (int i = 1; i < arr.length; i++) {
            Node<T>temp = new Node<T>(arr[i]);
            passer.next = temp;
            passer = passer.next;
        }


        return Head;
    }

    private static <T> void printLL(Node<T> head){

        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }


        System.out.println(" ");
    }

    private static <T> int lengthLL(Node<T> head){
        int count = 0 ;

        Node<T> temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count ;
        
    }

    private static <T> void insertElement(Node<T> head , T element){
        Node<T> temp = head ;
       
        while(temp != null){
            if (temp.next == null){
                break;
            }

            temp = temp.next;
        }

        temp.next = new Node<T>(element);
    }
}
