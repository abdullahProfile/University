import java.util.*;
public class EmployeTest {

public static void main(String [] args){
    Scanner reader=new Scanner(System.in);
    System.out.print("Enter Your Yearly Salary: ");
    int salary=reader.nextInt();


//find the 10% of his salary
    double raise=(salary) *0.10;
//mutiply that tax to their salary
    double result= salary +raise;
    System.out.print("Your total Salary is :"+ result);
}
}
