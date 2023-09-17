package Super;

public class SuperClass {
    int a = 10;

    public static class Subclass extends SuperClass{
        int a = 20;
        int b = super.a;
    }
}
