import java.sql.SQLOutput;
import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
//        int rollno = 64;
////        String is not primitive
//        char letter = 'r';
//        float marks = 98.67f;
//        double largeDecimalNumber = 464748874.48878;
//        long largeInteger = 364634537687483L;
//        boolean check = false;
//        Scanner input = new Scanner(System.in);
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " + rollno);
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println(name);

//        // // // Sum of two numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int num = num1 + num2;
        System.out.println("The sum of given numbers is: "+num);

    }
}
