package linkList.circlularList;


public class Dblc {

  class Node {
      int data;
      Node next;
      Node prev;
  }
  
  Node head;
  Node tail;
  
  public void insertStart(int data) {
      Node newNode=new Node();
      newNode.data=data;
      
      if(head == null){
          head=newNode;
          tail=newNode;
          head.prev=tail;
          tail.next=head;
      }else {
          newNode.next=head;
          newNode.prev=tail;
          
          //cricluler
          newNode.next=head;
          head.prev=tail;
          
          
          head=newNode;
      }
  }
  
  public void insertEnd(int data){
      Node newNode=new Node();
      newNode.data=data;
      
      if(head == null) {
          head=newNode;
          tail=newNode;
          head.prev=tail;
          tail.next=newNode;
      }
      else {
          newNode.prev=tail;
          tail.next=newNode;
          
          newNode.next=head;
          head.prev=tail;
          tail=newNode;
      }
  }
  
  public int deleteStart(){
      
      if(head == null){
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail) {
          int data=head.data;
          head=null;
          tail=null;
          return data;
          
      }else {
          int value=head.data;
           head=head.next;
           head.prev=tail;
           tail.next=head;
           return value;
      }
  }
  
  public int deleteEnd(){
      Node newNode=tail;
      
      if(head==null) {
          System.out.print("List Is Empty");
          return -1;
      }else if(head == tail) {
          int data=tail.data;
          head=null;
          tail=null;
          return data;
      }else {
          int value=tail.data;
           tail=tail.prev;
           tail.next=head;
           head.prev=tail;
           
           return value;
      }
  }
  
  public int deleteMid(int data){
      Node temp=head;
      
      if(temp == null) {
          System.out.print("List is Empty");
          return -1;
      }
      
      do {
          if(temp.data == data){
              if(head==tail && temp.data==data ) {
                  head=null;
                  tail=null;
              }else if(temp == head){
                  head=head.next;
                  head.prev=tail;
                  tail.next=head;
              }else if(temp == tail){
                  tail=tail.prev;
                  tail.next=head;
                  head.prev=tail;
              }else {
                  temp.prev.next=temp.next;
                  temp.next.prev=temp.prev;
              }
              
              return data;
          }
          
          temp=temp.next;
      }while(temp !=head);
      
      System.out.print("Node Not found");
      return -1;
  }
  public void printfoward(){
      Node newNode=head;
      if(newNode == null) {
          System.out.print("List is Empty");
      }
      
      do {
          System.out.print(newNode.data + "-->");
          newNode=newNode.next;
      }while(newNode !=head);
      
      System.out.println("");
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      Dblc blc=new Dblc();
      blc.insertStart(30);
      blc.insertStart(20);
      blc.insertEnd(40);
      blc.insertStart(60);
      blc.insertStart(70);
      blc.insertEnd(10);
      blc.printfoward();
      blc.deleteStart();
      blc.printfoward();
      blc.deleteMid(70);
      blc.printfoward();
  }
}
