package StaticKeyWord.StaticClass;

public class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    // Static nested class for Student
    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Student Name: " + name);
            System.out.println("Student Age: " + age);
        }
    }
}

