import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
//    public static void main(String[] args) {
////        // // // syntax : datatype[] variable_name = new datatype[size];
////        // // // input an array
//        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i=0; i< arr.length; i++){
//            arr[i] = input.nextInt();
//        }
////        for (int i=0; i< arr.length; i++){
////            System.out.print(arr[i] + " ");
////        }
////        // /// // easy method
//        for (int num : arr){
//            System.out.print(num + " ");
//        }
//
////        // // // string method to print array
//        System.out.println(Arrays.toString(arr));
//    }

//    // // // multi-dimensional arrays
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] arr = new int[3][3];
    System.out.println(arr.length);

    for (int row = 0; row < arr.length; row++){
        for (int col = 0; col<arr[row].length;col++){
            arr[row][col] = input.nextInt();
        }
    }
//    for (int row = 0; row < arr.length; row++){
//        for (int col = 0; col<arr[row].length;col++){
//            System.out.print(arr[row][col]+ " ");
//        }
//        System.out.println();
//    }

//    // // method 2 string
    for (int row = 0; row< arr.length; row++){
        System.out.println(Arrays.toString(arr[row]));
    }
}
}
