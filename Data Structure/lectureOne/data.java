package lectureOne;

class container<T> {

    private T data;

    public container(T data) {
        this.data=data;
    }

    public void setData(T data) {
        this.data= data;
    }

    public T getData(){
        return data;
    }

    public void printData(){
        System.out.println("Data: "+ data);
    }
}

public class data {
    public static void main(String[] args) {

        container<Integer> intContainer= new container(116);
        intContainer.printData();

        container<String> strContainer= new container("Abdullah");
        strContainer.printData();

        //upadate data
        intContainer.setData(120);
        strContainer.setData("Salman");
        intContainer.printData();
        strContainer.printData();


    }
}
