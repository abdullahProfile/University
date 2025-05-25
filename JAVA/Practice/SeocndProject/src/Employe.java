import java.util.*;
public class Employe {
    int hourse;
    int salary;

    public Employe (){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Salary:");
       int s=reader.nextInt();
        hourse=s;
        System.out.print("Enter work Hourse:");
        int h=reader.nextInt();
        salary=h;
    }
    void getsal() {

        if(salary<50000){
           salary= salary+1000;
           System.out.print(salary);
        }
    }
    void addwork(){
        if(hourse> 6) {
            salary=salary+500;
            System.out.print(salary);
        }
    }

    public static void main(String[] args) {

        Employe newEmploye=new Employe();
        newEmploye.getsal();
        newEmploye.addwork();
    }
}
