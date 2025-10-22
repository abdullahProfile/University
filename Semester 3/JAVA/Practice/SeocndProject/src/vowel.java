import java.util.*;
public class vowel {
    public static void main(String [] args) {

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter your number or Character : ");

        char vowel=reader.next().charAt(0);

        if(vowel=='a' || vowel== 'e' || vowel== 'i' || vowel== 'o' || vowel == 'u'){
            System.out.print(vowel + " " +"is vowel");
        }
        else if (vowel=='A' || vowel== 'E' || vowel== 'I' || vowel== 'O' || vowel == 'U'){
            System.out.print(vowel + " " +"is vowel");
        }
        else {
            System.out.print(vowel +" " + " is constant");
        }
    }
}
