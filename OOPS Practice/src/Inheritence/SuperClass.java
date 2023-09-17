package Inheritence;

public class SuperClass {
    int roll = 42;
    String name = "aman";

    public static class Subclass extends SuperClass{
        int subroll = 76;
        String subname = "yash";

        public void display(){
            System.out.println(name);
        }
    }

    public void display2(){
//        System.out.println(subname);              //error fek dega
    }
}
