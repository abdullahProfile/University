
class Node {
  int data;
  
  Node next;
  
  Node(int data){
      this.data=data;
      this.next=null;
  }
}

class Queue {
  Node front, rear;

  Queue() {
      front = rear = null;
  }

  // Enqueue operation
  public void inqueue(int data) {
      Node n = new Node(data);
      if (front == null) {
          front = rear = n;
          rear.next = front;
      } else {
          rear.next = n;
          rear = n;
          rear.next = front;
      }
  }

  public int dequeue() {
      if (front == null) {
          System.out.println("Queue is Empty");
          return 0;
      } else if (front == rear) {
          int data = front.data;
          front = rear = null;
          return data;
      } else {
          int data = front.data;
          front = front.next;
          rear.next = front;
          return data;
      }
  }

  public void display() {
      if (front == null) {
          System.out.println("Queue is Empty");
          return;
      }
      Node tmp = front;
      do {
          System.out.print(tmp.data + " ");
          tmp = tmp.next;
      } while (tmp != front);
      System.out.println();
  }
}

public class QueueUsingCirclularList {

  public static void main(String[] args) {
      System.out.println("Hello World!");

      Queue tmp= new Queue();

      tmp.inqueue(30);
      tmp.inqueue(10);
      tmp.inqueue(40);
      tmp.display();

      tmp.dequeue();
      tmp.display();
  }
}