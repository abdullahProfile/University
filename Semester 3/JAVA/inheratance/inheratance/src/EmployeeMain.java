
class Employee {
    int id,scale;

    Employee(int i,int s){
        id=i;
        scale=s;
    }
    void show(){
        System.out.println(id+"\t"+ scale);
    }
}

class Manager extends Employee {

    Manager(int i,int s){
        super(i, s);


    }

    void show(){
        System.out.println(id+"\t"+ scale);
    }

}
public class EmployeeMain {

   public static void main(String[] args) {
    Employee newEmployee= new Employee(4728,2000);
    newEmployee.show();

    Manager nManager=new Manager(2222, 21191);
    nManager.show();
   }
}
