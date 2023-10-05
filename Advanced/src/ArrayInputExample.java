import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // Read the number of elements

        int[] array = new int[n]; // Create an array of size n

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt(); // Read each element and store it in the array
        }

        // Display the input array
        System.out.println("You entered the following array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

//        scanner.close();
    }
}
