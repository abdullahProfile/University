package DoublyLL;

import DoublyLL.doublyLL.Node;

public class DbList <T>{

  class Node{
    Node next;
    Node prev;
    T data;
  }

  Node head;
  Node tail;

  public static void insertStart(T value){
    Node newNode= new Node();
    newNode.data=value;

    if(head == null){
      head=newNode;
      tail= newNode;
    }
    else {
      newNode.next=head;
      head.prev=newNode;
      head=newNode;
    }
  }

  public  T deleteAtStart(){

    if(head== null){
      System.out.println("Node Empty");
      return null;
    }else if(head == tail){

      T value= (T) head.data;
      head= null;
      tail=null;

      return value;
    }
    else {
      T value = (T) head.data;
      head=head.data;
      head.prev=null;

      return value;
    }
  }

  public void insertAtEnd(T value){
    Node newNode=new Node();
    newNode.data=value;

    if(head==null){
      head=newNode;
      tail=newNode;
    } else {
      tail.next=newNode;
      newNode.prev=tail;
      tail=newNode;

    }
  }

  public T deleteAtEnd(){

    if(tail== null){
      System.out.println("List Empty");
      return null;
    }else {
      T value= (T) tail.data;
      tail=tail.prev;
      tail.next=null;
      return value;
    }
  }

  public void printForward(){
    Node tempNode=head;

    while (tempNode !=null) {
      System.out.print(tempNode.data + "-->");
      tempNode=tempNode.next;
    }

    System.out.println(" ");
  }

  public void printbackward() {
    Node tempNode=tail;

    while (tempNode != null) {
      System.out.print(tempNode.data + "<--");
      tempNode=tempNode.prev;
    }

    System.out.println(" ");
  }

  public void searchNode(T value) {
    int count =1;

    Node tempNode=head;

    while (tempNode != null) {
      if(tempNode.data == value) {
        System.out.println("Your Node Find At:" + count);
        return;
      }

      tempNode=tempNode.next;
      count++;
    }
  }

  public static void main(String[] args) {
    DbList<Integer> newList=new DbList<>();

    newList.insertAtEnd(310);
    newList.deleteAtStart();
    newList.searchNode(310);
  }
}
