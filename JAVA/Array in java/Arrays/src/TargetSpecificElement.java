public class TargetSpecificElement {
    public static int target(int[] arry, int target) {

        for(int i=0; i<arry.length; i++){
            if(arry[i]== target){
                return target;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] array= {1,2,4,4,5};

        int target=5;

        int result= target(array,target);

        System.out.println("the array contain:"+result);
    }
}
