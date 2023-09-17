package Final;

public class Student {
    String name = "Aman";
    int marks = 48;
    final int roll = 67;

    public Student(String name, int marks, int roll) {
        this.name = name;
        this.marks = marks;
//        this.roll = roll;      // error fek dega
    }
}
