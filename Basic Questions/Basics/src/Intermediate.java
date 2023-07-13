import java.util.Scanner;

public class Intermediate {
    //        // / / // factorial program
//    public static void main(String[] args) {
//        System.out.print("Enter the number: ");
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int prod = 1;
//        for (int i = 1; i<=num; i++){
//            prod = prod*i;
//        }
//        System.out.println(prod);
//    }

//     // // // // Average of n numbers
//public static void main(String[] args) {
//    Scanner input  = new Scanner(System.in);
//    int count = -1;
//    int sum = 0;
//    while (true){
//        int num = input.nextInt();
//        count++;
//        if (num==0){
//            break;
//        }
//        sum = sum + num;
//    }
//    double avg = sum/count;
//    System.out.println(avg);
//}


//    // // // // sum of n numbers
//public static void main(String[] args) {
//    System.out.print("Enter the range of numbers: ");
//    Scanner input = new Scanner(System.in);
//    int num = input.nextInt();
//    int sum = 0;
//    for (int i=1; i<=num; i++){
//        sum = sum + i;
//    }
//    System.out.println(sum);
//}

//   // // // find ncr and npr
//public static void main(String[] args) {
//    System.out.print("Enter the values of n: ");
//    Scanner input = new Scanner(System.in);
//    int n = input.nextInt();
//    System.out.print("Enter the value of r: ");
//    int r = input.nextInt();
//
//    int ncr = facto(n)/(facto(n-r)*facto(r));
//    int npr = facto(n)/facto(n-r);
//    System.out.println("value of ncr is: " + ncr);
//    System.out.println("value of npr is: " + npr);
//}
//static int facto(int num){
//    int prod = 1;
//    for (int i =1; i<=num; i++){
//        prod = prod*i;
//    }
////    System.out.println(prod);
//    return prod;
//    }


//    // // // program to check pythogaren triplet using methods
    public static void main(String[] args) {
        triplet(3,4,8);

    }
    static void triplet(int s1, int s2, int s3){
        int comb1 = s1*s1 + s2*s2;
        int comb2 = s2*s2 + s3*s3;
        int comb3 = s3*s3 + s1*s1;
        if (comb1==s3*s3){
            System.out.println("pythogrean triplet");
        }
        else if (comb2 == s1*s1) {
            System.out.println("pythagorean triplet");
        }
        else if (comb3==s2*s2) {
            System.out.println("pythogorean triplet");
        }
        else {
            System.out.println("not a triplet");
        }
    }
}
