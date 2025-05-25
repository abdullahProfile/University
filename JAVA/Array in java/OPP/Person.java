package OPP;
import java.util.*;
public class Person {
    
    String name;
    int age;
    String gender;

    /*
     * A constructor is a special method used to initialize objects. It has the same name as the class and does not have a return type
     */
    Person (String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    void display(){
        System.out.println(name+" "+ age+ " "+ gender);
    }
    public static void main(String[] args) {

        Person object= new Person("abdullah", 20, "Male");
        object.display();
    }
}
