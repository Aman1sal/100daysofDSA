package Constructor;

public class Student {
    int roll = 23;
    String name = "Harsh";
    int marks = 84;

    int average;

    public Student(int roll, String name, int marks, int average) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.average = average;
    }

    public Student() {
        roll = 67;
        name = "Aman";
        marks = 98;
        average = 88;
    }
}
