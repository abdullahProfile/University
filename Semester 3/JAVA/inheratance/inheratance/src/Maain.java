class Animal {
    public void makeSound(){
        System.out.println("Animal makes a sound: ");
    }
}

class Dog extends Animal {
    
    public void makeSound(){
        System.out.println("Dog barks:");
    }
}

public class Maain {
    public static void main(String[] args) {

        Dog newdog = new Dog();
        newdog.makeSound(); // Output: Dog barks

        Animal newAnimal = new Animal();
        newAnimal.makeSound(); // Output: Animal makes a sound
        newdog.makeSound(); 
    }
}
