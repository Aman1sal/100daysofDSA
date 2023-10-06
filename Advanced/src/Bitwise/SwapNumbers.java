package Bitwise;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 89;
        int b = 486;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
