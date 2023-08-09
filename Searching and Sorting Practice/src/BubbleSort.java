import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23,44,52,43,65,21,89,97,54,63,31};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=1; j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
}
