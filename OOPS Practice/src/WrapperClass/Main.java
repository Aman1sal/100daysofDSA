package WrapperClass;

public class Main {
    public static void main(String[] args) {

        //        // // Unboxing
        Integer num = 10;
        int mynum = num.intValue();
        System.out.println(num);
        System.out.println(mynum);


//        // // Autoboxing
        int marks = 100;
        Integer newMarks = Integer.valueOf(marks);
        System.out.println(newMarks);
    }
}
