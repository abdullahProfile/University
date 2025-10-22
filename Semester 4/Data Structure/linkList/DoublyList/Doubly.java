package linkList.DoublyList;

public class Doubly <T>{

  class Node{
      T data;
      Node next;
      Node prev;
  }
  
  Node head;
  Node tail;
  
  public void start(T value){
      Node node=new Node();
      node.data=value;
      
      if(head == null) {
          head=node;
          tail=node;
      }else {
          node.next=head;
          node.prev=tail;
          head=node;
      }
  }
  
  public void End(T value) {
      Node node=new Node();
      node.data=value;
      
      if(head==null) {
          head=node;
          tail=node;
      }else {
          tail.next=node;
          node.prev=tail;
          tail=node;
      }
  }
  
  public T deleteStart(){
      Node node=head;
      
      if(head == null) {
          System.out.print("list is Empty");
          return null;
      }else if(head == tail) {
          
          T value =head.data;
          head=null;
          tail=null;
          
          return value;
      }
      else {
          T value=head.data;
          
          head=head.next;
          head.prev=null;
          
          return value;
      }
  }
  
  public T deleteEnd(){
      Node node=tail;
      
      if(head== null) {
          System.out.print("List is Empty");
          return null;
      } else if(head == tail){
          T value=tail.data;
          tail=null;
          head=null;
          
          return value;
      }else {
          T value=tail.data;
          
          tail=tail.prev;
          tail.next=null;
          
          return value;
      }
  }
  
  public void search(T key) {
      Node node=head;
      
      boolean found=false;
      
      int count=1;
      while(node !=null) {
          if(node.data == key) {
              System.out.print("Your Data find at:" + count+ " :Node data: "+ key);
                   found=true;
                   break;
          }
          
           node=node.next;
           count++;
      }
      
      if(!found){
          System.out.print("Not found");
      }
  }

  public void printF(){

      Node node=head;
      while(node !=null) {
          System.out.print(node.data+ "-->");
          node=node.next;
      }
      System.out.println();
  }
  
  public void printB(){
      
      Node node=tail;
      
      while(node != null){
          System.out.print(node.data +"<--");
          node=node.prev;
      }
      
      System.out.println();
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      Doubly<Integer> list=new Doubly<>();
      
      list.start(20);
      list.start(40);
      list.printF();
      
      list.End(50);
      list.End(60);
      list.printF();
  }
}