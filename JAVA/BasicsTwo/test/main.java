import java.util.*;

interface Task {
    void calculator(int item);

    
}
class Square implements Task {

    public void calculator(int item){

        System.out.println("Items: "+item+ " Square: "+ (item * item));
    }
}

class Prime implements Task{

    public void calculator(int item){

        System.out.println("Prime Number of: "+ item);
        for(int i=1; i<=item; i++){

           if(i % 2 !=0) {
            System.out.println(" Prime numbers between:"+item +"to "+ i);
           } 
        }
    }
}

class Fibbonaci implements Task {

   public void calculator(int items){

    System.out.println("Fibonacci series up to " + items + " is:");
        int a=1;
        int b=1;
        System.out.println(a + "\t"+ b);
        int temp=3;
        while (items==temp) {
            temp=a+b;
            System.out.println("fiabonnci series :"+ temp + "  ");
            a=b;
            b=temp;

            temp++;
        }
    }
}

public class main {

    public static void main(String[] args) {
        
        Square square= new Square();
        Prime nPrime=new Prime();
        Fibbonaci nFibbonaci=new Fibbonaci();

        Scanner reader =new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n=reader.nextInt();

        System.out.println("1: for square of the number:");
        System.out.println("2: for Prime Number of the number:");
        System.out.println("3: for Fabboinace Seriese of the number:");
        System.out.println("4: exist: ");

        int choice=0;
        do{
            System.out.print("Enter your choice: ");
            choice = reader.nextInt();
            switch (choice) {
                case 1:
    
                square.calculator(n);
                    break;
               case 2 : {
                nPrime.calculator(n);
                break;
               }
               case 3:
               {
                nFibbonaci.calculator(n);
                break;
               }
               case 4:{
                System.out.println("You are exist the program Thank You");
                break;
               }
                 
            }
        }
        while (choice != 4);

    }

}

