package linkList.SingleList;


public class SingleListOne<T> {

  class Node {
      T data;
      Node next;
  }

  Node head;
  Node tail;

  public void insertStart(T value) {
      Node newNode=new Node();
      newNode.data=value;

      if(head==null) {
          head=newNode;
          tail=newNode;
      }else {
          newNode.next=head;
          head=newNode;
      }
  }

  public void insertEnd(T value){
      Node newNode=new Node();
      newNode.data=value;

      if(head==null) {
          head=newNode;
          tail=newNode;
      }else {
          tail.next=newNode;
          tail=newNode;
      }
  }

  public T deleteStart() {
      Node newNode=head;

      if(head== null) {
          System.out.print("List is empty");
          return null;
      } else {
          T value=head.data;
          head=head.next;

          if(head==tail) {
             tail=null;
          }
          return value;
      }
  }

  public T deleteEnd() {
      Node newNode=tail;

      if(head==null) {
          System.out.print("List is Empty");
          return null;
      } else if(head == tail){
          T temp=tail.data;
          tail=null;
          head=null;
          return temp;
      }else {
          Node current=head;

          while(current.next != tail) {
              current=current.next;
          }

          T newValue=tail.data;
          tail=current;
          tail.next=null;
          return newValue;
      }
  }

    public void search(T key) {
     Node tempNode=head;
    int count=1;
     boolean found=false;
     while(tempNode !=null) {
         if(tempNode.data == key) {
           System.out.println("You Node find at :"+count +" Your Node: "+ key);
           found=true;
           break;
         }
          tempNode = tempNode.next;
          count++;
     }

     if(!found){
         System.out.println("Your Node is Note Found wit data: "+ key);
     }
 }
  public void printNode(){
      Node tempNode=head;

      while(tempNode != null) {
          System.out.print(tempNode.data + "->");
          tempNode=tempNode.next;
      }

      System.out.println(" ");
  }

  public static void main(String[] args) {
      System.out.println("Hello World!");

      SingleListOne<Integer> newNode=new SingleListOne<>();
      newNode.insertStart(10);
      newNode.insertStart(20);
      newNode.printNode();
      newNode.insertEnd(30);
      newNode.printNode();
      newNode.search(10);
      newNode.deleteEnd();
      newNode.printNode();
      newNode.deleteStart();
      newNode.printNode();
  }
}
