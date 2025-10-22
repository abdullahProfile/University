public class date {
    
    public static class month {

        //create blue prent of object
        int month;
        int date;
        int year;

        void display(){

            //display function
            System.out.println(date + "/" + month + "/" + year);
        }

        //function of parameters
        void get(int m, int d, int y) {
            month=m;
            date=d;
            year=y;
        }
    }

    public static void main(String [] arg) {

        //creat new object or physicaly apply a blue prent idea

        month result= new month();

        //this values is assigned to the get function and in thier the function is called function

        result.get(12 , 11 ,2010);

        //display the result of the object
        result.display();
    }
}
