package aman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
    }
}
