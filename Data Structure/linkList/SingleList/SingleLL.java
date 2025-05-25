package linkList.SingleList;


public class SingleLL {

  class Node {
      int data;
      Node next;
  }

  Node head;
  Node tail;
  public void insertStart(int data) {
      Node tempNode=new Node();
      tempNode.data=data;

      if(head == null) {
          head=tempNode;
          tail=tempNode;
      }else {
          tempNode.next=head;
          head=tempNode;
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

  public int deleteStart() {
      Node temp=head;

      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else {
          int value=head.data;

          if(head == tail) {
              head=null;
              tail=null;
          }else {
              head=head.next;
          }
          return value;
      }
  }

  public int deleteEnd() {

      if(head == null) {
          System.out.print("List is Empty");
          return -1;
      }else {
          int value=tail.data;
          if(head == tail){
              head=null;
              tail=null;
          }else {
              Node newNode=head;
              while(newNode.next != tail){
                  newNode=newNode.next;
              }
              newNode.next=null;
              tail=newNode;
          }
          return value;
      }
  }

  public void print() {
      Node temNode=head;

      while(temNode !=null) {
          System.out.print(temNode.data + "-->");
          temNode=temNode.next;
      }
      System.out.println();
  }

  public void search(int key){
      Node newNode=head;
      boolean found=false;
      int count=1;
      while(newNode !=null) {
          if(newNode.data== key){
              System.out.print("Node find At: "+ count + " :Your data"+ newNode.data);
              found=true;
          }
          newNode=newNode.next;
          count++;
      } if (!found){
          System.out.print("Node Not Found");
      }

      System.out.println();
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");

      SingleLL newSl=new SingleLL();
      newSl.insertStart(10);
      newSl.insertStart(20);
      newSl.insertEnd(30);
      newSl.print();
      newSl.deleteStart();
      newSl.print();
      newSl.search(10);
      newSl.deleteEnd();
      newSl.print();
  }
}
