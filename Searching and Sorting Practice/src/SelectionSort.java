import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {54,78,36,94,28,100,0,11,72,83};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr){
        for(int i =0; i<arr.length; i++){
            int largestnum = largest(arr,arr.length-i);
            swap(arr, largestnum, arr.length-i-1);
        }
    }

    public static int largest(int[] array, int lastindex){
        int large = 0;
        for(int i =0; i<lastindex; i++){
            if(array[i]>array[large]){
                large = i;
            }
        }
        return large;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
