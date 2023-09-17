package Constructor;

public class Main {
    public static void main(String[] args) {
        Student Student1 = new Student(43, "rbcjrh", 69, 90);
        System.out.println(Student1);
        System.out.println(Student1.roll);
        System.out.println(Student1.name);
        System.out.println(Student1.marks);
        System.out.println(Student1.average);

        Student Student2 = new Student();
        System.out.println(Student2.name);
    }
}
