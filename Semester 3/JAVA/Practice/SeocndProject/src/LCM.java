import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum=reader.nextInt();
        System.out.print("Enter Second Number: ");
        int seconNum=reader.nextInt();

        int LCM=(firstNum > seconNum) ? firstNum : seconNum;

      while(true){
        if(LCM % firstNum==0 && LCM % seconNum==0){
            System.out.print(LCM);
            break;
        }
        ++LCM;
      } 
    }


}
