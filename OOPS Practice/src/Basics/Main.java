package Basics;

public class Main {
    public static void main(String[] args) {
        Student Student1 = new Student();
        System.out.println(Student1.marks);
        System.out.println(Student1.name);
        System.out.println(Student1.roll);
        Student1.marks = 93;
        System.out.println(Student1.marks);
        System.out.println(Student1.average);
        Student1.average = 58;
        System.out.println(Student1.average);
    }
}
