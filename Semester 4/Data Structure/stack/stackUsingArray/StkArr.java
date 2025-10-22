package stack.stackUsingArray;


public class StkArr {

  int[] arr;
  int size,capacity;
  int top;
  
  StkArr(int capacity){
      this.capacity=capacity;
      arr=new int[capacity];
      size=0;
      top=-1;
  }
  
  public void push(int data){
      
      if(isfull()){
          System.out.print("stack overflow");
      }else {
          arr[++top]=data;
          size++;
      }
  }
  
  public int pop(){
      
      if(isEmpty()){
          System.out.print("stack underflow");
          return -1;
      }else {
          int data=arr[top--];
          size--;
          return data;
      }
  }
  
  public int peek(){
      
      if(isEmpty()){
          System.out.print("stack underflow");
          return -1;
      }else {
          return arr[top];
      }
  }
  
  public boolean isfull(){
      return top==capacity-1;
  }
  
  public boolean isEmpty(){
      return top==-1;
  }
  
  public void print(){
      
      if(isEmpty()){
          System.out.print("List is Empty");
      }else {
          for(int i=0; i<=top; i++){
              System.out.print(arr[i]+ " ");
          }
          System.out.println();
      }
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      StkArr tmp=new StkArr(3);
      
      tmp.push(10);
      tmp.push(20);
      tmp.push(30);
      tmp.print();
  }
}
