import java.util.*;
public class Alphabet {
    
    public static void main(String [] args) {
        Scanner reader=new Scanner(System.in);

        System.out.print("Enter character or number for chceking:");
        char character=reader.next().charAt(0);


        if((character>='a' && character <='z') ||(character >= 'A' && character <='z')){
            System.out.print(character+ " " + "Is alphabet:");
        }
        else {
            System.out.print(character+ " " + "Is not Alphabet:");
        }
    }
}
