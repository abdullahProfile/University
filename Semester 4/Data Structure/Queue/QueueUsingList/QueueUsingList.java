package Queue.QueueUsingList;


class Node {
  int data;
  Node next;

  Node(int data){
      this.data=data;
      this.next=null;
  }
}

class Queue{
  public Node front,rear;

  Queue(){
      front=rear=null;
  }

  public void Enqueue(int data){
      Node newNode=new Node(data);

      if(front==null){
          front=rear=newNode;
      }else {
          rear.next=newNode;
          rear=newNode;
      }
  }

  public int DeQueue() {
      if(front==null) {
          System.out.print("List Empty");
          return -1;
      }else {
          int value=front.data;
          front=front.next;

          if(front==null){
              rear=null;
          }

          return value;
      }
  }

  public void print(){
      if(front==null){
          System.out.print("List is Empty");
      }else {
          Node temp=front;

          while(temp !=null){
              System.out.print(temp.data +" ");
              temp=temp.next;
          }

          System.out.println();
      }
  }
}
public class QueueUsingList {

  public static void main(String[] args) {
      System.out.println("Hello World!");

      Queue temp=new Queue();

      temp.Enqueue(10);
      temp.Enqueue(30);
      temp.Enqueue(40);
      temp.print();
      temp.DeQueue();
      temp.print();
  }
}
