public class Main {
    public static void main(String[] args) {
//        // Constructor 1
        StringBuffer sb = new StringBuffer();
        sb.append("Aman");
        sb.insert(4, " bansal");
        String str = sb.toString();
        System.out.println(str);

        // // Constructor 2
        StringBuffer sb2 = new StringBuffer("Bansal");

    }
}
