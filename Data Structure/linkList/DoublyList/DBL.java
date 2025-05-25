package linkList.DoublyList;


public class DBL {

  class Node {
      int data;
      Node next;
      Node prev;
  }
  
  Node head;
  Node tail;
  
  public void insertAtStart(int data) {
      Node newNode=new Node();
      newNode.data=data;
      
      if(head == null) {
          head=newNode;
          tail=newNode;
      }else {
          newNode.next=head;
          head.prev=newNode;
          head=newNode;
      }
  }
  
  public void insertAtEnd(int data) {
      Node newNode=new Node();
      newNode.data=data;
      
      if(head == null) {
          head=newNode;
          tail=newNode;
      }else {
          tail.next=newNode;
          newNode.prev=tail;
          tail=newNode;
      }
  }
  
  public int deleteStart(){
      if(head==null){
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail) {
          int value=head.data;
          head=null;
          tail=null;
          return value;
      }else {
          int tempValue=head.data;
          head=head.next;
          head.prev=null;
          return tempValue;
      }
  }
  
  public int deleteAtEnd(){
      if(head==null){
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail) {
          int value=tail.data;
          head=null;
          tail=null;
          return value;
      }else {
          int tempvalue=tail.data;
          tail=tail.prev;
          tail.next=null;
          return tempvalue;
      }
  }
  
  public void printForward(){
      Node newNode=head;
      
      while(newNode !=null) {
          System.out.print(newNode.data + "-->");
          newNode=newNode.next;
      }
      
      System.out.println();
  }
  
  public void printBackwar() {
      Node newNode=tail;
      
      while(newNode != null) {
          System.out.print(newNode.data + "<--");
          newNode=newNode.prev;
      }
      
      System.out.println();
  }
  public static void main(String[] args) {
      
      DBL dbl=new DBL();
      dbl.insertAtStart(10);
      dbl.insertAtEnd(20);
      dbl.printForward();
      dbl.deleteStart();
      dbl.printForward();
      dbl.deleteAtEnd();
      dbl.printForward();
      dbl.deleteAtEnd();
  }
}