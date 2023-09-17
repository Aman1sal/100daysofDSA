package StaticKeyWord.StaticVariable;

public class Student {
    String name = "Aman";
    int roll = 36;

    static int marks = 100;         //hamesha yhi rhega(Override Nhi kr skte)

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}