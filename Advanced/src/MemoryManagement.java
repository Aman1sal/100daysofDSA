public class MemoryManagement {

    public static void main(String[] args) {
//        int a = 10;
//        int b = a + 10;
//        a = 40;
//        System.out.println(a);
//        System.out.println(b);
        Integer c = Integer.valueOf(10);
        Integer d = Integer.valueOf(c.intValue() + 10);
        c = Integer.valueOf(40);
        d = Integer.valueOf(c.intValue() + 20);
        System.out.println(c);
        System.out.println(d);
    }
}
