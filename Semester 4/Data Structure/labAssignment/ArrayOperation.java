public class ArrayOperation {

  public static int findMaximum(int arr[], int i, int j) {
    int max=arr[i];

    for (int k=i+1; k<=j; k++) {
      if(arr[k] > max) {
        max=arr[k];
      }
    }

    return max;
  }

  public static int maxPosition(int arr[], int i,int j) {
    int maxPos=i;

    for(int k= i+1; k<=j; k++) {
      if(arr[k] > arr[maxPos]) {
        maxPos=k;
      }
    }

    return maxPos;
  }

  public static int findMin(int arr[], int i, int j) {
    int min=arr[i];

    for(int k=i+1; i<=j; i++) {
      if(arr[k] < min) {
        min=arr[k];
      }
    }

    return min;
  }

  public static int minPosition(int arr[], int i, int j) {
    int minPos=i;

    for(int k=i+1; i<=j; i++) {
      if(arr[k] < arr[minPos]) {
        minPos=arr[k];
      }
    }
    return minPos;
  }

  public static void swap(int arr[], int i, int j) {
    int temp=arr[i];

    arr[i]=arr[j];

    arr[j]=temp;
  }

  public static void main(String[] args) {

    int[] arr={1,3,4,4,5,9};

    System.out.println("Max Number: " + findMaximum(arr, 0, 5));
    System.out.println("Max Position: " + maxPosition(arr, 0, 5));
    System.out.println("Min Number: " + findMin(arr, 0, 5));
    System.out.println("Min Position: " + minPosition(arr, 0, 5));

  }
}