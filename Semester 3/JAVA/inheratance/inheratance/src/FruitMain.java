import javax.sound.midi.Soundbank;

class Fruit {
    String FruitName;
    String FruitTast;
    int size;

    Fruit(String na, String T, int s){
        FruitName=na;
        FruitTast=T;
        size=s;
    }

    void eat(String n,String t){
        FruitName=n;
        FruitTast=t;
        System.out.println("Fruit Name: "+FruitName);
        System.out.println("Fruit Taste:"+ FruitTast);
        System.out.println();
    }

    void showFruit(){
        System.out.println("The Parent Class: ");
        System.out.println("Fruit Name: "+FruitName);
        System.out.println("Fruit Taste:"+ FruitTast);
        System.out.println("Fruit Size: "+ size);
        System.out.println();
    }
}

class Apple extends Fruit{
    int price,quantity;

    Apple(String na, String T, int s,int p,int q){
        super(na, T, s);
        price=p;
        quantity=q;
    }

    void ShowApple(){
        System.out.println("Apple is the child of Fruit: ");
        System.out.println("Fruit Name: "+FruitName);
        System.out.println("Fruit Taste:"+ FruitTast);
        System.out.println("Fruit Size: "+ size);
        System.out.println("Fruit Price: "+ price+"Rs");
        System.out.println("Fruit Quantity: "+quantity+"Kg");
        System.out.println();
    }
}

class  Orange extends Fruit {

    int price,quantity;

    Orange(String na,String T, int s,int p,int q){
        super(na, T, q);
        price=p;
        quantity=q;
    }

    void showOrange(){
        System.out.println("Orange is the Child of Fruit:");
        System.out.println("Fruit Name: "+FruitName);
        System.out.println("Fruit Taste:"+ FruitTast);
        System.out.println("Fruit Size: "+ size);
        System.out.println("Fruit Price: "+ price+"Rs");
        System.out.println("Fruit Quantity: "+quantity+"Kg");
        System.out.println();
    }
}



public class FruitMain {
    public static void main(String[] args) {
        
        Fruit nFruit= new Fruit("Banana", "Good", 2);//parent class object

        Apple nApple=new Apple("Apple", "Sweet", 12, 120, 1);//child class object

        Orange nOrange=new Orange("Orange", "Sweet", 12, 150, 1);//child class object

        nFruit.showFruit();
        nApple.ShowApple();
        nOrange.showOrange();
        
        //calling eat function
        System.out.println("The Fruit that eaten");
        System.out.println();
        nFruit.eat("Apple", "sweet");
    }
    
}
