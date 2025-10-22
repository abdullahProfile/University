package stack;


class Node {
  public int data;
  Node next;

  Node(int d){
      data=d;
      next=null;
  }
}

class Stack{
  public Node top;

  Stack() {
      this.top=null;
  }

  public void push(int data){
      Node newNode=new Node(data);
      newNode.next=top;
      top=newNode;
  }

  public int pop() {
      if(isEmpty()){
          System.out.print("Stack is Empty");
      }

      int popedValue=top.data;
      top=top.next;
      return popedValue;
  }

  public int peek(){
      if(isEmpty()){
          System.out.print("Stack empty");
      }
      return top.data;
  }
 public boolean isEmpty(){
     return top==null;
 }
}
public class Main {

  public static void main(String[] args){
      Stack stack=new Stack();
      stack.push(10);
      stack.push(31);
      stack.push(1);

      System.out.println("Top element: " + stack.peek());
      System.out.println("Popped element: " + stack.pop());
      System.out.println("Top element after pop: " + stack.peek());
  }

}
