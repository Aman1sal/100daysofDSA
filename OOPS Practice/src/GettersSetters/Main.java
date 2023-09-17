package GettersSetters;

public class Main {
    public static void main(String[] args) {
        Student Aman  = new Student(23, "Aman");
//        System.out.println(Aman.num);      // Error fek dega
        System.out.println(Aman.getNum());
        System.out.println(Aman.setNum(34));
    }
}
