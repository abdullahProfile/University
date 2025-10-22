public class book {
    
    void display(){
        System.out.println("I am parent:");
    }
    
    class child extends book{
        void showC(){
            System.out.println("I am child");
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Starting inheratince in Java:");

        book outer= new book();
        book.child obj=outer.new child();
        obj.display();
        obj.showC();
    }
}
