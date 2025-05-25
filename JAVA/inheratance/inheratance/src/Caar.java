
class vehicle{

    protected int speed;

    vehicle(){
        speed=0;
    }
    void showspeed(){
        System.out.println("The intial speed is :"+ speed);
    }
}

class Car extends vehicle{

    Car(){
        super.speed=60;
    }
}

public class Caar {
    
    public static void main(String[] args) {
        
        Car newcar= new Car();
        newcar.showspeed();
    }
}
