public class Date {
    int day;
    int month;
    int year;

    public Date(int d, int m,int y){
        day=d;
        month=m;
        year=y;
    }

    void display(){
        System.out.println(day+ "/" + month + "/"+ year);
    }

    public static void main(String[] args){
        Date newDate= new Date(27, 3, 2024);
        newDate.display();
    }
}
