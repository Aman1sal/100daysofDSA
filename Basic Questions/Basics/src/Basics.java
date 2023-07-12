import java.util.Scanner;

public class Basics {

//    // // // Odd Even

//    public static void main(String[] args) {
//        System.out.println("Enter the number");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextByte();
//        if (num%2==0){
//            System.out.println(num + " is even");
//        }
//        else {
//            System.out.println(num + " is odd");
//        }
//    }

//    // // Greet message

//    public static void main(String[] args) {
//    System.out.println("Enter your name");
//    Scanner input = new Scanner(System.in);
//    String name = input.nextLine();
//        System.out.println("Namaste " + name);
//}

//    // // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//    public static void main(String[] args) {
//        System.out.print("enter the value of principal: ");
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        System.out.print("enter the value of time: ");
//        int num2 = input.nextInt();
//        System.out.print("enter the value of rate: ");
//        double num3 = input.nextDouble();
//        double interest = num1*num2*num3;
//        System.out.println("the value of interest is "+interest);
//}

//     // // // // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//public static void main(String[] args) {
//    System.out.print("Enter the first number: ");
//    Scanner input = new Scanner(System.in);
//    int num1 = input.nextInt();
//    System.out.print("Enter the Second number: ");
//    int num2 = input.nextInt();
//    System.out.print("Enter the Operation you want to perform: ");
//    char oper = input.next().charAt(0);
//    if (oper == '+'){
//        System.out.println(num1 + num2);
//    } else if (oper == '-') {
//        System.out.println(num1 - num2);
//    } else if (oper == '*') {
//        System.out.println(num1*num2);
//    } else if (oper == '/') {
//        System.out.println(num1/num2);
//    }
//    else {
//        System.out.println("Please Enter the valid operation");
//    }
//}

//    // // //Take 2 numbers as input and print the largest number.
//    public static void main(String[] args) {
//        System.out.print("Enter the first number: ");
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        System.out.print("Enter the Second number: ");
//        int num2 = input.nextInt();
//
//        if (num1>num2){
//            System.out.println(num1+" is greatest");
//        }
//        else {
//            System.out.println(num2+" is greatest");
//        }
//    }

    // // // Input currency in rupees and output in USD.
//    public static void main(String[] args) {
//        System.out.println("Enter the amoutn of rupees you have: ");
//        Scanner input = new Scanner(System.in);
//        double rupee = input.nextDouble();
//        double dollors = rupee/82.28;
//        System.out.println("total dollars: " + dollors);
//    }

//    // // // To calculate Fibonacci Series up to n numbers.
//public static void main(String[] args) {
//    int first = 0;
//    int second = 1;
//    System.out.print("Enter the range: ");
//    Scanner input = new Scanner(System.in);
//    int n = input.nextInt();
//
//    if(n==1){
//        System.out.println(first);
//    } else if (n==2) {
//        System.out.println(second);
//    } else {
//        System.out.println(first);
//        System.out.println(second);
//        for(int i =0; i<n-2; i++){
//            int third = first + second;
//            first = second;
//            second = third;
//            System.out.println(third);
//        }
//    }
//}

//    // // // //To find Armstrong Number between two given number.
    public static void main(String[] args) {
        System.out.print("Enter the initial range of number: ");
        Scanner input  = new Scanner(System.in);
        int num1  = input.nextInt();
        System.out.print("Enter final range of number: ");
        int num2  = input.nextInt();

        for (int i =num1; i<num2; i++){
            int ones = i%10;
            int tens = (i/10)%10;
            int hundreds = (i/100)%10;
            int armstrong = ones*ones*ones + tens*tens*tens + hundreds*hundreds*hundreds;
            if (armstrong == i){
                System.out.println(i);
            }
            else {
                continue;
            }
        }
}
}

