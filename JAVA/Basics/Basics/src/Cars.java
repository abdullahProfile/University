import java.util.*;
public class Cars {
    String carName;
    int carModel;
    String ownerName;

    Cars(String carName, int carModel, String ownerName){
    this.carName=carName;
    this.carModel=carModel;
    this.ownerName=ownerName;
}

String getcarName(){
    return carName;
}
int carModel(){
    return carModel;
}
String ownerName(){
    return ownerName;
}

public static void main(String[] args) {
    
    Scanner reader= new Scanner(System.in);
    System.out.println("Enter The Numbers of Cars: ");

    int obj=reader.nextInt();
    reader.nextLine();
    Cars[] CarsObj=new Cars[obj];

    for(int i=0; i<CarsObj.length; i++){
        System.out.println("Enter details for cars At index :"+ (i+1)+ ": ");
        System.out.print("Car Name: ");
        String carName=reader.nextLine();
        System.out.print("Enter Car Model: ");
        int carModel=reader.nextInt();
        reader.nextLine();
        System.out.print("Enter Owner Name: ");
        String ownerNAme=reader.nextLine();

        CarsObj[i]= new Cars(carName,carModel,ownerNAme);
    }
    System.out.println();
    System.out.println("__________________");
    for(int i=0; i<CarsObj.length; i++){
        System.out.println("Car at index: "+(i+1)+": ");
        System.out.println("Car Name: "+ CarsObj[i].getcarName());
        System.out.println("Car Model: "+ CarsObj[i].carModel);
        System.out.println("owner Name: "+ CarsObj[i].ownerName);
        System.out.println();
    }
}
}
