class test {
    void showTest(){
        System.out.print("I am parent class");
    }

    class Child extends test(){
        void showHild(){
            System.out.print("i am child class");
        }
    }

    public static void main(String[] args) {
        
        Child obj= new Child();
        obj.showTest();
    }
}