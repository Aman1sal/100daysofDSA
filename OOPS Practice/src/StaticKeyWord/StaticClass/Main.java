package StaticKeyWord.StaticClass;

public class Main {
    public static void main(String[] args) {
        School.Student Aman = new School.Student("Alice", 18);
        School mySchool = new School("RLVM");
        System.out.println(Aman);
        System.out.println(mySchool);
    }
}
