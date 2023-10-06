public class PassByValue {
    public static void main(String[] args) {
        int num1 = 44;
        int num2 = num1;
        System.out.println(num2);
        num1 = 56;
        System.out.println(num2);
    }
}
