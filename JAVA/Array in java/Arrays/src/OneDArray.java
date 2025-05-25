public class OneDArray {
    public static void main(String[] args) {

        int[] array= new int[6];

        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        array[5]=60;

        for(int i=0; i<=array.length; i++){
            System.out.println("Element At index: "+i +": "+ array[i]);
        }
    }
}
