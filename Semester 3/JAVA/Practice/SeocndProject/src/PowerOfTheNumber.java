import java.util.*;

import javax.sound.midi.SysexMessage;
public class PowerOfTheNumber {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter base of the number: ");
        int base=reader.nextInt();

        System.out.print("Enter Exponent of the number: ");
        int exponent=reader.nextInt();

        int result=1;
        while(exponent !=0) {
            result *=base;
            --exponent;
        }
        System.out.print("The power of the number is : " +result);
    }
}
