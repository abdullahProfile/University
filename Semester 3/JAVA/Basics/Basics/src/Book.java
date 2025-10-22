import java.util.*;
public class Book {
    String bookName;
    int bookPages;
    int price;

    Book(String kbookName, int kbookPages, int kprice){

        bookName=kbookName;
        bookPages=kbookPages;
        price=kprice;
    }

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Books Number That You have Store: ");
        int newObj=reader.nextInt();

        reader.nextLine();//Consume newline left by nextInt()

        Book[] booksArray= new Book[newObj];

        int max=0;

        for(int i=0; i<booksArray.length; i++){
            System.out.println("Enter Books at Index: "+ (i+1)+": ");//i+1 mean the index starting from that for human readable

            System.out.print("Enter Book Name: ");
            String bookName=reader.nextLine();

            System.out.print("Enter Book Pages: ");
            int bookPages=reader.nextInt();

            System.out.print("Enter Book Price: ");
            int price=reader.nextInt();

            reader.nextLine();
            booksArray[i]=new Book(bookName, bookPages, price);
        }
        System.out.println();

        for(int i=0; i<booksArray.length; i++){
            System.out.println("Book at index : "+ (i+1)+": ");
            System.out.println("Book Name: "+booksArray[i].bookName);
            System.out.println("Book Pages: "+ booksArray[i].bookPages);
            System.out.println("Book Price: "+ booksArray[i].bookPages);
            System.out.println();

            if(booksArray[i].bookPages > max){
                booksArray[i]=new Book(bookName,bookPages,price); 
                System.out.print("Max pages book is :"+booksArray[i]);
            }
        }
    }
}
