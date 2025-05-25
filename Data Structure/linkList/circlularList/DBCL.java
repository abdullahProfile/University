package linkList.circlularList;

public class DBCL {

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
          head.prev=tail;
          tail.next=head;
      }else {
          newNode.next=head;
          newNode.prev=tail;
          head.prev=newNode;
          tail.next=newNode;
          head=newNode;
      }
  }
  
  public void insertEnd(int data) {
      Node newNode =new Node();
      newNode.data=data;
      
      if(head == null) {
          head=newNode;
          tail=newNode;
          head.prev=tail;
          tail.next=head;
      }else {
          newNode.prev=tail;
          tail.next=newNode;
          newNode.next=head;
          head.prev=newNode;
          tail=newNode;
      }
  }
  
  public int deleteStart(){
      
      if(head==null){
          System.out.print("list is Empty");
          return -1;
      }else if(head == tail){
          int value=head.data;
          head=null;
          tail=null;
          return value;
      }else {
          int temV=head.data;
          head=head.next;
          head.prev=tail;
          tail.next=head;
          return temV;
      }
  }
  
  public int deleteEnd(){
      
      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail){
          int value=tail.data;
          head=null;
          tail=null;
          return value;
      }else {
          int temV=tail.data;
          tail=tail.prev;
          tail.next=head;
          head.prev=tail;
          return temV;
      }
  }
  public void printForward() {
      Node newNode=head;
      
      do {
          System.out.print(newNode.data + "-->");
          newNode=newNode.next;  
      }while(newNode!=head);

      
      System.out.println();
  }
  
  public int deleteMid(int data) {
      Node newNode=head;
      
      do {
          if(newNode.data == data){
              if(head == tail && newNode.data == data){
                  head=null; 
                  tail=null;
              }else if(newNode == head){
                  head=head.next;
                  head.prev=tail;
                  tail.next=head;
              }else if(newNode == tail){
                  tail=tail.prev;
                  tail.next=head;
                  head.prev=tail;
              }else {
                  newNode.prev.next=newNode.next;
                  newNode.next.prev=newNode.prev;
              }
              return data;
          }
          newNode=newNode.next;
      }while(newNode !=head);
      
          System.out.println("Value not found in the list");
          return -1;
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      DBCL dbl=new DBCL();
      dbl.insertAtStart(20);
      dbl.insertAtStart(10);
      dbl.insertEnd(40);
      dbl.insertAtStart(20);
      dbl.insertAtStart(100);
      dbl.printForward();
      dbl.deleteMid(10);
      dbl.printForward();
  }
}
