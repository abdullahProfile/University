package stack.stackUsingList;


public class Stklist {
    
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
              System.out.print("List is Empty");
              return -1;
          }else {
              int value=top.data;
              top=top.next;
              return value;      
          }
      }

  
  public int peek(){
      if(isEmpty()){
          System.out.print("List is Empty");
          return -1;
      }
      return top.data;
  }
  
  public void print(){
      Node newNode=top;
      
      if(isEmpty()){
          System.out.println("List is Empty");
      }else {
          while(newNode !=null) {
              System.out.print(newNode.data+ " ");
              newNode=newNode.next;
          }
          
          System.out.println();
      }
  }
  
  public void search(int key){
      Node newNode=top;
      boolean found=false;
      int count=1;
      while(newNode !=null){
          if(newNode.data == key){
              System.out.print("data find at: "+ count +"Your data:" + key);
              found=true;
              break;
          }
          newNode=newNode.next;
          count++;
      }
  }
  
  public boolean isEmpty(){
      return top==null;
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      Stklist tmp=new Stklist();
      tmp.print();
      tmp.push(20);
      tmp.push(40);
      tmp.push(50);
      tmp.print();
      
      tmp.pop();
      tmp.print();
      tmp.search(20);
  }
}
