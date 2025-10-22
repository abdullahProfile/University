package linkList.SingleList;


public class SingleList<T> {

  class Node{
      T data;
      Node Next;
  }
  
  Node head;
  Node tail;
  
  public void insertStart(T value){
      Node newNode=new Node();
      newNode.data=value;
      
      if(head == null){
          head=newNode;
          tail=newNode;
      }
      else {
          newNode.Next=head;
          head=newNode;
      }
  }
  
  public T deleteAtStart(){
      Node newNode=head;
      
      if(head == null){
          System.out.print("List is Empyt");
          return null;
      } else {
          T value=head.data;
          head=null;
          tail=null;
          return value;
      }
  }
  
  public void InsertAtEnd(T value){
      Node newNode=new Node();
      newNode.data=value;

      if(tail==null) {
          head=newNode;
          tail=newNode;
      }else {
          tail.Next=newNode;
          tail=newNode;
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

  public void search(T key){
      int count=1;
      Node tempNode=head;
      while(tempNode!=null){
          if(tempNode.data == key){
              System.out.print("Node Find At :" + count);
              tempNode=tempNode.Next;
          }

          tempNode=tempNode.Next;
          count++;
      }
  }

  public void print(){
      Node tempNode=head;
      while(tempNode!=null){
          System.out.print(tempNode.data+ "-->");
          tempNode=tempNode.Next;
      }
      System.out.print("null");
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");

      SingleList<Integer> ll=new SingleList<>();
      ll.insertStart(10);
      ll.insertStart(41);
      ll.insertStart(41);
      ll.InsertAtEnd(51);
      ll.search(10);
      System.out.println();
      ll.print();

  }
}
