import linkedlist.Node;
public class DeleteHeadOfTheLL {
  public static void main(String[] args) {
    Integer[] arr = {45,21,65,85,96};
    Node<Integer>Harr = arrayToLL(arr);

    printLL(Harr);
  }

  private static <T> Node<T> arrayToLL (T[] arr){
    Node<T> head = new Node<T>(arr[0]);
    Node<T> iterator = head;

    for (int i = 1; i < arr.length; i++) {
        Node<T> temp = new Node<T>(arr[i]);

        iterator.next = temp;
        iterator = iterator.next;
    }
    
    return head;
  }
  
  private static <T> void printLL(Node<T> Head){
    Node<T> temp = Head;
    System.out.print("{ ");
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println("}");
  }
}
