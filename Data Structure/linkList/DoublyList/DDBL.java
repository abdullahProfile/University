package linkList.DoublyList;


public class DDBL {

  class Node {
      int data; 
      Node next,prev;
  }
  
  Node head,tail;
  
  public void insertStart(int data) {
      Node newNode=new Node();
      newNode.data=data;
      
      if(head == null) {
          head=tail=newNode;
      }else {
          newNode.next=head;
          head.prev=newNode;
          head=newNode;
      }
  }
  
  public void insertEnd(int data) {
      Node newNode=new Node();
      newNode.data=data;
      
      if(head== null) {
          head=tail=newNode;
      }else {
          tail.next=newNode;
          newNode.prev=tail;
          tail=newNode;
      }
  }
  
  public int deleteStart(){
      
      if(head == null){
          System.out.print("List is Empty");
          return -1;        
      }else if(head ==tail){
          int data=head.data;
          head=tail=null;
          return data;
      }else {
          int value=head.data;
          head=head.next;
          head.prev=null;
          return value;
      }
  }
  
  public int deleteEnd(){
      
      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail) {
          int data=head.data;
          head=tail=null;
      }else {
        int value=tail.data;
        tail=tail.prev;
        tail.next=null;
        return value;
      }
      return -1;
  }
  public void printForward(){
      
      if(head == null) {
          System.out.print("List is Empty");
          
      }else {
          Node temp=head;
          while(temp !=null) {
              System.out.print(temp.data + "-->");
              temp=temp.next;
          }
          
          System.out.println();
      }
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      DDBL tmp=new DDBL();
      
      tmp.insertStart(20);
      tmp.insertStart(40);
      tmp.insertEnd(10);
      tmp.insertEnd(50);
      tmp.printForward();
      tmp.deleteStart();
      tmp.printForward();
      tmp.deleteEnd();
      tmp.printForward();
  }
}
