package MidLabPaper;


class tikects{
  int id;
  int ticket;
  String name;
  int price;
  tikects next;
  
  tikects(int id, int ticket, String name){
      this.id=id;
      this.ticket=ticket;
      this.name=name;
      price=20;
      this.next=null;
  }
}

class custumerBooking{
  tikects front,rear;
  
  custumerBooking(){
      front=rear=null;
  }
  
  public void inqueue(int id, int tikects,String name){
      tikects tmp=new tikects(id,tikects,name);
      
      if(tikects == 20){
          System.out.print("You allow for on 20 tikects");
      }else if (front == null && rear == null) { 
          front = rear = tmp;
      }
      else {
          rear.next=tmp;
          rear=tmp;
      }
  }
  
  public String dequeue(){
      tikects tmp=front;
      
      if(front == null){
          System.out.print("List Empty nothing to delete");
          return null;
      }else {
          int id=front.id;
          int tikect=front.ticket;
          String name=front.name;
          int price=front.price;
          
          front=front.next;
          
          if(front == null){
              rear=null;
          }
              return id +" "+ tikect +" "+ name+ " "+ price;
      }
  }
  
  public void print(){
      tikects tmp=front;
      
      if(front==null){
          System.out.println("List is Empty");
      }else {
          while(tmp !=null){
              if(tmp.id % 2 == 0){
                  System.out.print("Even id :" + tmp.id + " " +tmp.ticket+" "+ tmp.name +" "+ tmp.price);
              }
              tmp=tmp.next;
          }
          
          System.out.println();
      }
  }
  
 public int total() {
  int totalAmount = 0;
  tikects tmp = front;
  
  while (tmp != null) {
      totalAmount += tmp.price * tmp.ticket;
      tmp = tmp.next;
  }
  
  return totalAmount;
}

}
public class SeatBooking {

  public static void main(String[] args) {
      System.out.println("Hello World!");
      
      custumerBooking tmp=new custumerBooking();
      tmp.inqueue(10, 2,"Abdullah");
      tmp.inqueue(30, 15,"aizaz");
      tmp.inqueue(3, 4, "Mustafa");
      tmp.print();
      
      tmp.dequeue();
      tmp.print();
      
      System.out.println("Total: " + tmp.total());
  }
}
