package AccessModifiers;

public class Main {
    public static void main(String[] args) {

        A obj = new A(10,"aman");
        System.out.println(obj.getNum());
        obj.setNum(15);
        System.out.println(obj.getNum());
    }
}
