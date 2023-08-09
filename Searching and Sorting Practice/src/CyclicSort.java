import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {9,8,2,1,4,3,6,5,7};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicsort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
