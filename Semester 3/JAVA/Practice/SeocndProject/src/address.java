public class address {
    String name;
    int yearOfJoin;
    int salary;
    String address;
    public address(String n, int year, int sal,String addre){
        name=n;
        yearOfJoin=year;
        salary=sal;
        address=addre;
    }
    void display(){
        System.out.println("Name"+"\t"+"Year of Joining"+"\t"+"Salary"+"\t"+ "Address");
        System.out.println("____________________________________________________");
        System.out.print(name+"\t"+ yearOfJoin+"\t"+salary+"\t"+address);
    }

    public static void main(String[] args){
        address obj=new address("M.Umar", 2021, 30000, "Islamabad");
        obj.display();
    }
}
