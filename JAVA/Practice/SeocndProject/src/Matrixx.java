import java.util.Scanner;

public class Matrixx {

public static void main(String[] args) {
    
    Scanner reader= new Scanner(System.in);
    System.out.print("Enter Row of the matrix: ");
    int row= reader.nextInt();

    System.out.print("Enter colum of the matrix: ");
    int colum= reader.nextInt();
   
    int[][] matrix= new int[row][colum];

    for(int i= 0; i< row; i++){
        for(int j=0; j<colum; j++){
            System.out.print("Enter element at position "+ (i+1)+ ": ");
            matrix[i][j]= reader.nextInt();
        }
        System.out.println();
    }
        for(int i=0; i<row; i++){
        int rowsum=0;
        for (int j=0; j<colum; j++){
           rowsum += matrix[i][j];
        }
        System.out.println("Sum of the rows is :"+ (i+1)+ ":"+ rowsum);
    }

    for(int j=0; j<colum; j++){
        int colSum=0;
        for(int i=0; i<row; i++){
            colSum += matrix[i][j];
        }
        System.out.println("Sum of The column is : "+ (j+1)+": "+colSum);
    }
}
}
