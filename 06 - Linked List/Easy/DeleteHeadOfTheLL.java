import linkedlist.*;
public class DeleteHeadOfTheLL {
  public static void main(String[] args) {
    String[] arr = {"Manas" , "Sharma" , "Air" , "Water" , "Ling" , "Condom"};
    Node<String>Harr = LinkedListUtils.arrToSinglyLinkedList(arr);
    Node<String>Nhead = deleteHead(Harr);

    LinkedListUtils.printSinglyLinkedList(Nhead);
    
  }

  private static <T> Node <T> deleteHead(Node<T> head){
    Node<T> Nhead = head.next ;

    return Nhead;
  }


  
}
