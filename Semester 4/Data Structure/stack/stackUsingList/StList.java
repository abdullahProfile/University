package stack.stackUsingList;


public class StList {

  class Node {
      int data;
      Node next;
  }
  
  Node top;
  
  public void push(int data) {
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
          int value=top.data;
          top=top.next;
          return value;
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
  
  public void printst(){
      Node newNode=top;
      
      while(newNode !=null) {
          System.out.print(newNode.data + " ");
          newNode=newNode.next;
      }
      
      System.out.println("");
  }
  
  public boolean isEmpty(){
      return top==null;
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      StList st=new StList();
      
      System.out.println("Is list is Empty: " +st.isEmpty());
      
      st.push(10);
      st.push(20);
      st.push(30);
      st.printst();
      st.pop();
      st.printst();
      
      System.out.println("Top data of stack: " + st.peek());
  }
}
