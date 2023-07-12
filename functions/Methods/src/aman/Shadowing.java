package aman;

public class Shadowing {
    static int x = 90;          //This will be shadowed once another value of it is added in same scope
    public static void main(String[] args) {
        System.out.println(x);
        x= 10;
        System.out.println(x);
    }
}
