import java.util.*;

import javax.sound.midi.Soundbank;

public class Book {
    int pages;
    String name;

    Book (int p, String n){
        pages= p;
        name=n;

    }

    void show (){
        System.out.println("Book Pages: "+ pages +" Name of the book :"+ name);
    }
    public static void main(String[] args) {
        

        Book newbook = new Book(120, "English");
        Book newbook1= new Book(130, "Programming");

        newbook.show();
        newbook1.show();
        int x=newbook.pages;
        int y=newbook1.pages;

        if(x>y){
            System.out.println("The Book is High Pages:"+ newbook.pages);
        }else {
            System.out.println("This book have High Pages: "+ newbook1.pages);
        }

    }
}