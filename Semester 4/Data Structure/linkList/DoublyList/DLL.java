package linkList.DoublyList;


public class DLL<T>{

  class Node {
        T data;
        Node next;
        Node prev;
  }

  Node head;
  Node tail;

  public void insertAtStar(T data){
      Node newNode=new Node();
      newNode.data=data;

      if(head==null) {
         head=newNode;
         tail=newNode;

      } else {
          newNode.next=head;
          newNode.prev=tail;
          head=newNode;
      }
  }

  public void insertAtEnd(T data){
      Node newNode=new Node();
      newNode.data=data;

      if(head==null) {
          head=newNode;
          tail=newNode;

      } else {
          tail.next=newNode;
          newNode.prev=tail;
          tail=newNode;
      }
  }

  public void printFoward() {
      Node tempNode=head;
      while(tempNode != null) {
      System.out.print(tempNode.data +"-->");
      tempNode=tempNode.next;
  }
      System.out.println("");
  }

  public void printBackward() {
      Node tempNode=tail;

      while(tempNode != null) {
          System.out.print(tempNode.data + "<--");
          tempNode=tempNode.prev;
      }

      System.out.print(" ");
  }

  public T DeletAtStart() {

      if(head == null) {
          System.out.print("List Is Empty");
          return null;

      }else if(head == tail) {
          T value=(T) head.data;
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

  public T deletAtEnd() {

      if(tail==null) {
          System.out.print("List is Empty");
          return null;
      } else{

          T value=tail.data;
          tail=tail.prev;
          tail.next=null;
          return value;
      }
  }

  public void searchNode(T key) {
      int count=1;

      Node temp=head;

      while(temp !=null) {
          if(temp.data == key) {
          System.out.print("Your Node Found at" + count);
      }

          temp=temp.next;
          count++;
      }
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");

      DLL<Integer> newNode=new DLL<>();

      newNode.insertAtStar(30);
      newNode.insertAtEnd(50);
      newNode.insertAtEnd(60);
      newNode.printFoward();
      newNode.printBackward();
      newNode.DeletAtStart();
      newNode.searchNode(50);
      newNode.deletAtEnd();
  }
}
