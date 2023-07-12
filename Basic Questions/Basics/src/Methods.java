public class Methods {

//    //    // // // areas
//    public static void main(String[] args) {
//        Circle(15);
//        triangle(15, 15, 15);
//        rectangle(15,15);
//    }
//    static void Circle(double r){
//        System.out.println(Math.PI * r * r);
//    }
//    static void triangle(double a, double b, double c){
//        double s = (a + b + c)/2;
//        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
//        System.out.println(area);
//    }
//
//    static void rectangle(double length, double breadth){
//        System.out.println(length*breadth);
//    }

//    // // // Perimeters
    public static void main(String[] args) {
        rectangle(15,15);
        circle(15);
        square(15);
}
static void rectangle(double length, double breadth){
        double perimeter = 2*(length + breadth);
    System.out.println(perimeter);
}
static void circle(double radius){
        double perimeter = 2*Math.PI*radius;
    System.out.println(perimeter);
}
static void square(double side){
        double perimeter = 4*side;
    System.out.println(perimeter);
    }
}
