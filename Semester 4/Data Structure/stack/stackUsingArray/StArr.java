package stack.stackUsingArray;


public class StArr {

  int[] arr;
  int top;
  
  public void insertData(int size){
       arr=new int[size];
        top=-1;
  }
  
  public void push(int data){
      
      if(arr == null) {
          System.out.print("Stack is not initialized. Call insertData first.");
      }
      if(isFull()){
          System.out.print("Stack is Overflow");
      }else {
          arr[++top]=data;
      }
  }
  
  public int pop(){
      
      if(arr == null ||isEmpty()){
          System.out.print("list is Underflow");
          return -1;
      }else {
          int value=arr[top--];
          return value;
      }
  }
  
  public int peek(){
      if(arr ==null ||isEmpty()) {
          System.out.print("stack is underflow");
          return -1;
      }else {
          return arr[top];
      }
  }
  public boolean isFull(){
      return top ==arr.length-1;
  }
  
  public boolean isEmpty(){
      return top == -1;
  }
  
  public void print(){
      if(isEmpty()){
          System.out.print("Stack underflow");
      }else {
          for(int i=0; i<=top; i++){
              System.out.print(arr[i] + " ");
          }
          
          System.out.println();
      }
  }
  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      StArr st=new StArr();
      
      st.insertData(10);
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(5);
      st.push(6);
      st.push(7);
      st.push(8);
      st.push(9);
      st.push(10);
      st.print();
      st.pop();
      st.print();
      
      System.out.println("Top data: "+ st.peek());
  }
}

