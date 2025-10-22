package DoublyLL;

public class doublyList<T> {

  class Node {
    T data;
    Node prev=null;
    Node next= null;
  }

  Node tail;
  Node head;

  public void insertAtStart(T value) {
    Node newNode= new Node();
    newNode.data= value;

    if (head == null) {
      head=newNode;
      tail=newNode;
    } else {
      newNode.next= head;
      head.prev=newNode;
      head=newNode;
    }
  }

  public T deleteAtStart() {
    if(head==null) {
      System.out.println("List is Empty");
      return null;
    } else if(head == tail) {
      T value= (T) head.data;
      head=null;
      tail=null;
      return value;
    }

    else {
      T value = (T) head.data;
      head=head.next;
      head.prev=null;
      return value;
    }
  }

  public void insertAtEnd(T value) {
    Node newNode= new Node();
    newNode.data=value;

    if(head== null) {
      head=newNode;
      tail=newNode;
    } else {
      tail.next= newNode;
      newNode.prev=tail;
      tail=newNode;
    }
  }

  public T deleteAtEnd() {

    if(tail == null) {
      System.out.println("List Empty");
      return null;
    } else if (head==tail) {
      T value =(T) tail.data;
      tail=null;
      head= null;

      return value;
    } else {
      T value= (T) tail.data;
      tail= tail.prev;
      tail.next= null;

      return value;

    }
  }

  public void printForward() {
    Node tempNode= head;

    while (tempNode !=null) {
      System.out.print(tempNode.data + " ");
      tempNode=tempNode.next;
    }

    System.out.println(" ");
  }

  public void printbackward() {
    Node tempNode=tail;

    while (tempNode != null) {
      System.out.println(tempNode.data + " ");
      tempNode=tempNode.prev;
    }

    System.out.println(" ");
  }

  public void search(T key) {
    int count= 1;

    Node tempNode=head;

    while (tempNode !=null) {

      if(tempNode.data == key) {
        System.out.println("Node found at No: " +count);
        return;
      }

      tempNode=tempNode.next;
      count++;
    }
  }

  public static void main(String[] args) {
    doublyList<String> dll= new doublyList<>();
    dll.deleteAtStart();
    dll.deleteAtEnd();

    dll.insertAtStart("abdullah");
    dll.insertAtStart("uzair");
    dll.insertAtEnd("Shaheer");
    dll.printForward();
    dll.printbackward();
    dll.search("Uzair");
  }
}
