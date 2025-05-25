package linkList.DoublyList;


public class DBBL {

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
      }else {
          newNode.next=head;
          head.prev=newNode;
          head=newNode;
      }
  }

  public void insertEnd(int data) {
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

  public int deleteStart() {

      if(head == null) {
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
          head.prev=null;
          return value;
      }
  }

  public int deleteEnd() {
      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail){
          int value=tail.data;
          head=null;
          tail =null;
          return value;
      }else {
          int valuee=tail.data;
           tail=tail.prev;
           tail.next=null;
          return valuee;
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

  public void printBackward(){
      Node newNode=tail;

      while(newNode!= null) {
          System.out.print(newNode.data + "<--");
          newNode=newNode.prev;
      }

      System.out.println();
  }

  public void search(int key){
      Node newNode=head;
      boolean found=false;
      int count=1;
      while(newNode != null){
          if(newNode.data==key){
              System.out.print("Node is Find at: " + count+ " : Your Data: "+key);
              found=true;
          }

          newNode=newNode.next;
          count++;
      }

      if(!found){
          System.out.print("Note Found");
      }
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");

      DBBL dbls=new DBBL();

      dbls.insertStart(10);
      dbls.insertStart(30);
      dbls.insertEnd(40);
      dbls.printForward();
      dbls.printBackward();

      dbls.deleteStart();
      dbls.printForward();
      dbls.deleteEnd();
      dbls.printForward();

  }
}
