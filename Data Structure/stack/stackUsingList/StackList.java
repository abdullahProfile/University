package stack.stackUsingList;

public class StackList {

  class Node{
      int data;
      Node next;
  }
  
  Node head;
  Node tail;
  
  class stack{

      static int size=0;
 
      
      public void push(int value) {
          Node newNode=new Node();
          newNode.data=value;
          
          newNode.next=head;
          head=newNode;
          size++;
      }
      
      public int pop(){
          
          if(isEmpty()){
              System.out.print("List is Empty");
              return -1;
          }else {
              int value=head.data;
              head=head.next;
              head=null;
              size--;
              return value;
              
          }
      }
      
      public int peek(){
          
          return head.data;
      }
      
      public boolean isEmpty(){
          
          if(head == null){
              System.out.print("stack is Underflow");
              return true;
          }
          return false;
      }
      
      public void display() {
          if(isEmpty()){
              System.out.print("stack is underFlow");
          } else {
              Node tempNode=head;
              while(tempNode != null) {
                  System.out.print(tempNode.data + "-->");
                  tempNode=tempNode.next;
              }
          }
          
          System.out.println();
      }
      
      public int stackSize(){
          return size;
      }
      
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      StackList stackList = new StackList();
      stack stack = stackList.new stack();
      
      stack.push(20);
      stack.push(40);
      stack.display();
  }
}
