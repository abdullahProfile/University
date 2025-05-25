 class inheratance {
    
    int x;
    inheratance(){
        x=100;
    }

    void show(){
        System.out.println("Parent class vairable: "+ x);
    }
}

class B extends inheratance {
    int x;

    B(){
        super.x=200;
        x=300;
    }

    void show(){
        super.show();
        System.out.println("child class vairable: "+ x);
    }
    void addMe(){
        int z;
    
        z= super.x +x;
        System.out.println("Addition :"+ z);
    }
}



public class Main {
public static void main(String[] args) {

    B obj= new B();
    obj.show();

 
    obj.addMe();

    inheratance obj1=new inheratance();
    obj1.show();
}
}

