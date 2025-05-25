package linkList.circlularList;


public class DBC {

  class Node {
      int data;
      Node next;
      Node pre;
  }
  
  Node head;
  Node tail;
  
  public void insertAtStart(int data) {
      Node newNode= new Node();
      newNode.data=data;
      if(head == null) {
          head=newNode;
          tail=newNode;
          
          head.pre=tail;
          tail.next=head;
      }else {
          newNode.next = head;
          newNode.pre = tail;
          head.pre = newNode;
          tail.next = newNode;
          head = newNode;       
      }
  }
  
  public void insertEnd(int data) {
      Node newNode=new Node();
      newNode.data=data;
      
      if(head == null) {
          head=newNode;
          tail=newNode;
          head.next = head;
          head.pre = head;
      }else {
          newNode.pre = tail;
          newNode.next = head;
          tail.next = newNode;
          head.pre = newNode;
          tail = newNode;
      }
  }
  
  public int deleteStart(){
      
      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail) {
          int value=head.data;
          head=null;
          tail=null;
          return value;
      }else {
          int tempV = head.data;
          head=head.next;
          head.pre=tail;
          tail.next=head;
          return tempV;
      }
  }
  
  public int deleteEnd(){
      
      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail) {
          int value=tail.data;
          head=null;
          tail=null;
          return value;
      }else {
          int tempV=tail.data;
           tail.pre=tail;
           tail.next=head;
           head.pre=tail;
           return tempV;
      }
  }
  
  public void printForward() {
      Node newNode=head;
      
      while(newNode != tail) {
          System.out.print(newNode.data + "-->");
          newNode=newNode.next;
      }
      
      System.out.println();
  }
  
  public void printBackward() {
      Node newNode=tail;
      
      while(newNode != head) {
          System.out.print(newNode.data +"<--");
          newNode=newNode.pre;
      }
      
      System.out.println();
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      DBC dbc=new DBC();
      
      dbc.insertAtStart(20);
      dbc.insertAtStart(30);
      dbc.insertEnd(40);
      
      dbc.printForward();
      dbc.deleteStart();
      dbc.printForward();
      
  }
}
