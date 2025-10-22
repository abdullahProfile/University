import java.util.Scanner;

public class MaxBook {
    int bookId;
    String bookName;
    double price;

    MaxBook(int kid, String kname, double kprice){
        bookId=kid;
        bookName=kname;
        price=kprice;
    }
    void show(){
        System.out.println("Book Id: "+ bookId);
        System.out.println("Book Name: "+ bookName);
        System.out.println("book price: "+price);
    }

    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {

        Scanner reader= new Scanner(System.in);
        System.out.print("Enter Qauantity of the books: ");
        int book=reader.nextInt();
        MaxBook[] newBooks= new MaxBook[book];

        for(int i=0; i<newBooks.length; i++){
            System.out.print("Enter book Detail at index: "+ (i+1)+": ");
            System.out.print("Enter book Id: ");
            int Id=reader.nextInt();
            reader.nextLine();
            System.out.print("Enter book Name: ");
            String Bname=reader.nextLine();

            System.out.print("Enter Book Price: ");
            double bprice= reader.nextDouble();

            newBooks[i]= new MaxBook(Id, Bname, bprice);
        }
        for(int i=0; i<newBooks.length; i++){
            newBooks[i].show();
        }
    }
}
