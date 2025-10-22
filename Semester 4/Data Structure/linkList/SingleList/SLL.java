package linkList.SingleList;


public class SLL {

  class Node{
      int data;
      Node next;
  }

  Node head;
  Node tail;

  public void insertStart(int data){
      Node newNode=new Node();
      newNode.data=data;

      if(head == null) {
          head=tail=newNode;
      }else {
          newNode.next=head;
          head=newNode;
      }
  }

  public void insertEnd(int data) {
      Node newNode=new Node();
      newNode.data=data;

      if(head==null) {
          head=tail=newNode;
      }else {
          tail.next=newNode;
          tail=newNode;
      }
  }

  public int deleteStart(){

      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else if(head == tail) {
          int data=head.data;
          head=tail=null;
          return data;
      }else {
          int value=head.data;
          head=head.next;
          return value;
      }
  }

  public int deleteEnd(){

      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else if (head == tail) {
          int data=tail.data;
          head=tail=null;
          return data;
      }else {
          Node current=head;
          int value=tail.data;
          while(current.next!= tail) {
            current=current.next;
          }

          current.next=null;
          current=tail;
          return value;
      }
  }
  public void print(){
      Node newNode=head;

      while(newNode !=null) {
          System.out.print(newNode.data+ "-->");
          newNode=newNode.next;
      }

      System.out.println();
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");

      SLL temp=new SLL();
      temp.insertStart(20);
      temp.insertStart(40);
      temp.insertEnd(10);
      temp.print();

      temp.deleteStart();
      temp.print();

      temp.deleteEnd();
      temp.print();
  }
}
