package Queue;


class Node {
  int data;
  Node next;

  Node(int data) {
      this.data=data;
      this.next=null;
  }
}

class queue{
  Node front,rear;

  queue(){
      front=rear=null;
  }
  public void enqueue(int data){
      Node newNode=new Node(data);

      if(front == null) {
          front=rear=newNode;
      }else {
          rear.next=newNode;
          rear=newNode;
      }

  }

  public int dequeue(){

      if(front == null){
          System.out.print("Queue is Empty");
          return -1;
      }else {
          int data=front.data;
          front=front.next;

          if(front==null){
              rear=null;
          }
          return data;
      }
  }

  public void print(){
      Node newNode=front;

      while(newNode !=null){
          System.out.print(newNode.data + " ");
          newNode=newNode.next;
      }
      System.out.println();
  }
}

public class QueueUsingListt {

  public static void main(String[] args) {
      System.out.println("Hello World!");

      queue tmp=new queue();

      tmp.enqueue(10);
      tmp.enqueue(30);
      tmp.enqueue(40);
      tmp.enqueue(50);
      tmp.enqueue(100);
      tmp.print();

      tmp.dequeue();
      tmp.print();

  }
}
