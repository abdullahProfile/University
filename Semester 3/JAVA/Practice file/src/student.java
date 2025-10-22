public class student {

    public static class studen {
        String name;
        int rolNo;
        char section;
    }


public static void main(String [] arg){

    studen object= new studen();

    object.name="Abdullah";
    object.rolNo=116;
    object.section='D';

    System.out.print(object.name +"\t" + object.rolNo + "\t" + object.section);
}
}