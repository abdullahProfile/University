package Queue.QueueUsingArray;

public class CircularArr {

  int[] arr;
  int front, rear, size, capacity;

  CircularArr(int capa) {
      capacity = capa;
      arr = new int[capacity];
      front = 0;
      rear = -1;
      size = 0;
  }

  public void inqueue(int data) {
      if (size == capacity) {
          System.out.println("Queue is full");
      } else {

         /*
          * Easy and simple logic for a circular array queue.
          * 1. On the first enqueue:
          *    rear = (rear + 1) % capacity
          *    rear = (-1 + 1) % 2 = 0
          *    So, rear becomes 0.
          * 2. The data is stored at arr[rear], which means:
          *    arr[0] = data
          *    The data is added at index 0 of the array.
          */
          rear = (rear + 1) % capacity;
          arr[rear] = data;
          size++;
      }
  }

  public int dequeue() {
      if (size == 0) {
          System.out.println("Queue is empty");
          return -1;
      } else {
          int data = arr[front];

          /* 
          * This updates the front pointer in a circular manner.
          * 1. Increment the front pointer: front + 1.
          * 2. Use the modulo operator (% capacity) to ensure the front
          *    wraps around to the beginning of the array when it reaches
          *    the end (circular behavior).
          */

          front = (front + 1) % capacity;
          size--;
          return data;
      }
  }

  public void print() {
      if (size == 0) {
          System.out.println("Queue is empty");
      } else {
          System.out.println("Queue elements:");
          for (int i = 0; i < size; i++) {
              System.out.print(arr[(front + i) % capacity] + " ");
          }
          System.out.println();
      }
  }

  public static void main(String[] args) {
      CircularArr temp = new CircularArr(2);

      temp.inqueue(20);
      temp.inqueue(40);
      temp.print();

      temp.dequeue();
      temp.print();

      temp.inqueue(60);
      temp.print();
  }
}
