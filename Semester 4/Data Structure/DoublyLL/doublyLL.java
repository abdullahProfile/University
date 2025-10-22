
public class doublyLL<T> {

  class Node {
    T data;
    Node prev=null;
    Node next= null;
  }

  Node head;
  Node tail;

  public void InsertAtStart(T value) {
    Node n= new Node();
    n.data=value;

    if(head == null) {
      head= n;
      tail=n;
    }

    else {
      n.next=head;
      head.prev=n;
      head=n;
    }
  }

  public T deletAtStar() {
    if(head == null) {
      System.out.println("List is Empyt");

      return null;
    }

    else if (head == tail) {
        T value= (T) head.data;
        head=null;
        tail=null;
        return value;
    }

    else {
      T value= (T) head.data;

      head = head.next;
      head.prev=null;

      return value;
    }
  }

  public void inserAtEnd(T value) {

    Node n= new Node();
    n.data=value;

    if(head == null) {
      head=n;
      tail=n;
    } else {
      tail.next=n;
      n.prev=tail;
      tail=n;
    }
  }

  public T deletAtEnd() {
    if(tail==null) {
      System.out.println("List is Empty");

      return null;
    } else if(head == tail) {
        T value = (T) tail.data;
        head= null;
        tail=null;

        return value;
      }

      else {
        T value= (T) tail.data;

        tail=tail.prev;
        tail.next=null;
        return value;
      }
    }



    public void printForward() {
      Node temp=head;

      System.out.println("print list forward");

      while (temp !=null) {
        System.out.println(temp.data+ " ");
        temp=temp.next;
      }

      System.out.println(" ");
    }

    public void printbackward() {
      Node temp= tail;

      while (temp != null) {
        System.out.println(temp.data + " ");
        temp=temp.prev;
      }

      System.out.println(" ");
    }

    public void search(T key) {
      int count=1;

      Node temp=head;
      while (temp != null) {
        if(temp.data == key) {
          System.out.println("Found at Node No: "+ count);
          return;
        }

        temp= temp.next;
        count++;
      }

      System.out.println("Value Not Found");
    }

    public static void main(String[] args) {

      doublyLL<Integer> dll=new doublyLL<>();

      dll.deletAtStar();
      dll.deletAtEnd();

      dll.InsertAtStart(3);
      dll.InsertAtStart(5);
      dll.InsertAtStart(1);
      dll.inserAtEnd(4);
      dll.printForward();
    }
  }


