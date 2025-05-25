package linkList.SingleList;


public class SL {

  class Node {
      int data;
      Node next;
  }

  Node head;
  Node tail;
  public void insertStart(int data) {
      Node newNode=new Node();
      newNode.data=data;
      if(head == null) {
          head=newNode;
          tail=newNode;
      }else {
          newNode.next=head;
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
         tail=newNode;

     }
 }

 public int deleteStart(){

     if(head == null) {
         System.out.print("List is Empty");
         return -1;
     }else{

         int data=head.data;
         if(head == tail){
             head=null;
             tail=null;
         }else {
             head=head.next;
         }
         return data;
     }
 }

 public int deleteEnd() {

     if(head == null) {
         System.out.print("List is Empty");
         return -1;
     }else {
         int data=tail.data;

         if(head == tail) {
             head=null;
             tail=null;
         }else {
             Node temp=head;

             while(temp.next !=tail){
                 temp=temp.next;
             }

             temp.next=null;
             tail=temp;
         }

         return data;
     }
 }

 public void print(){
     Node temp=head;

     do {
         System.out.print(temp.data + "-->");
         temp=temp.next;
     }while(temp != null);

     System.out.println();
 }
  public static void main(String[] args) {
      System.out.println("Hello World!");

      SL sl=new SL();

      sl.insertStart(10);
      sl.insertStart(20);
      sl.insertStart(30);
      sl.insertEnd(40);
      sl.print();

      sl.deleteStart();
      sl.print();
      sl.deleteEnd();
      sl.print();
  }
}