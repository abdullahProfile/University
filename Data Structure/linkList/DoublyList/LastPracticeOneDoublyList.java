package linkList.DoublyList;

public class LastPracticeOneDoublyList  {

  class Node{
      int data;
      Node next,prev;
  }

  Node head,tail;

  public void insertStart(int data) {
      Node tmp=new Node();
      tmp.data=data;

      if(head == null) {
          head=tail=tmp;
      }else {
          tmp.next=head;
          head.prev=tmp;
          head=tmp;
      }
  }

  public void insertEnd(int data) {
      Node newNode= new Node();
      newNode.data=data;

      if(head==null) {
          head=tail=newNode;
      }else {
          tail.next=newNode;
          newNode.prev=tail;
          tail=newNode;
      }
  }

  public int deleteStart(){

      if(head == null) {
          System.out.print("List Empty nothing to delete");
          return -1;
      }else {
          int data=head.data;

          if(head ==tail) {
              head=null;
              tail=null;
          }else {
            head=head.next;
            head.prev=null;
          }
          return data;
      }
  }

  public int deleteEnd(){

      if(head == null){
          System.out.print("List Empty nothing to delete");
          return -1;
      }else {
          int data=tail.data;

          if(head==tail){
              head=tail=null;
          }else {
              tail=tail.prev;
              tail.next=null;
          }
          return data;
      }
  }
  public void printForward(){
      if(head== null) {
          System.out.print("List is Empty");
      }else {
          Node tmp=head;
          while(tmp !=null) {
              System.out.print(tmp.data +"-->");
              tmp=tmp.next;
          }

          System.out.println();
      }
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");

      LastPracticeOneDoublyList tmp=new LastPracticeOneDoublyList();

      tmp.insertStart(20);
      tmp.insertEnd(212);
      tmp.insertStart(30);
      tmp.printForward();
      tmp.deleteStart();
      tmp.printForward();
      tmp.deleteEnd();
      tmp.printForward();
      tmp.deleteStart();
      tmp.printForward();
  }
}