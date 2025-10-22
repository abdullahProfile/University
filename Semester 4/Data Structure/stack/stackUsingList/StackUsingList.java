package stack.stackUsingList;


public class StackUsingList {

  class Node {
      int data;
      Node next;
  }
  
  Node top;
  
  public void push(int data){
      Node newNode=new Node();
      newNode.data=data;
      
      newNode.next=top;
      top=newNode;
  }
  
  public int pop(){
      
      if(isEmpty()){
          System.out.print("Stack underflow");
          return -1;
      }else {
          int data=top.data;
          top=top.next;
          return data;
      }
  }
  
  public int peek(){
      
      if(isEmpty()){
          System.out.print("Stack underflow");
          return -1;
      }else {
          return top.data;
      }
  }
  
  public void print(){
      Node temp=top;
      
      while(temp !=null) {
          System.out.print(temp.data + " ");
          temp=temp.next;
      }
      
      System.out.println();
  }
  public boolean isEmpty(){
      return top==null;
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      StackUsingList stk=new StackUsingList();
      
      stk.push(10);
      stk.push(30);
      stk.push(50);
      stk.print();
      stk.pop();
      stk.print();
      
      System.out.println("Top data: " + stk.peek());
      
  }
}
