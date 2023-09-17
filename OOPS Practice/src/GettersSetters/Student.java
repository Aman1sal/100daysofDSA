package GettersSetters;

public class Student {
    private int num = 24;
    private String name = "Aman";

    public int getNum(){
        return this.num;
    }

    public int setNum(int num){
        this.num = num;
        return this.num;
    }

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
