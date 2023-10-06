public class PassByRefernece {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("aman");
        StringBuilder b = a; // 'b' now refers to the same StringBuilder object as 'a'
        System.out.println(b); // Prints "aman"

        a.append("jcrbjhgutr"); // Modify the contents of the StringBuilder object referred to by 'a'
        System.out.println(b); // Prints "amanjcrbjhgutr" because 'b' and 'a' refer to the same object
    }
}
