package linkList.DoublyList;


public class DbList<T> {

  class Node{
      T data;
      Node next;
      Node prev;
  }
  
  Node head;
  Node tail;
  public void insertAtStart(T value) {
      Node newNode=new Node();
      newNode.data=value;
      
      if(head== null) {
          head=newNode;
          tail=newNode;
      } else {
         newNode.next= head;
         newNode.prev=tail;
         
         head = newNode;
      }
  }
  
  public T deleteAtStart() {
      
      if(head== null) {
          System.out.print("List Empty");
          return null;
          
      } else if(head == tail) {
          T value= (T) head.data;
          head=null;
          tail=null;
          return value;
          
      } else {
          T value=(T) head.data;
          head=head.next;
          head.prev=null;
          return value;
      }
  }
  
  public void insertAtEnd(T value) {
      Node newNode=new Node();
      newNode.data=value;
      
      if(head == null){
          head=newNode;
          tail=newNode;
      } else {
          tail.next=newNode;
          newNode.prev=tail;
          tail=newNode;
      }
  }
  
  public T deleteAtEnd() {
      
      if(tail == null) {
          System.out.print("List is Empty");
          return null;
      } else {
          T value = (T) tail.data;
          tail=tail.prev;
          tail.next=null;
          return value;
      }
  }
  
  public void searchNode(T key){
      int count=1;
      
      Node tempNode=head;
      
      while(tempNode != null){
          if(tempNode.data == key) {
              System.out.print("Node find at: "+ count);
              return;
          }
          
          tempNode=tempNode.next;
          count++;
      }
  }
  
  public void printForward() {
      Node tempNode=head;
      
      while(tempNode != null) {
          System.out.print(tempNode.data+ "--> ");
          tempNode=tempNode.next;
      }

      System.out.print(" ");
  }

  public void printBackward() {
      Node tempNode= tail;

      while(tempNode != null){
       System.out.print(tempNode.data + "<--");
       tempNode=tempNode.prev;
  }

      System.out.print(" ");
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");

      DbList<Integer> newNode=new DbList<>();

      newNode.insertAtStart(10);
      newNode.insertAtStart(40);
      newNode.insertAtEnd(90);
      newNode.printBackward();
      System.out.println();
      newNode.printForward();

  }
}
