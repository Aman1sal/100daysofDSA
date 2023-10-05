public class GreetingApp {
    public static void main(String[] args) {
        // Check if any command-line arguments were provided
        if (args.length > 0) {
            // The first argument (args[0]) is the user's name
            String userName = args[0];

            // Print a greeting message
            System.out.println("Hello, " + userName + "!");
        } else {
            // If no arguments were provided, print a generic greeting
            System.out.println("Hello, World!");
        }
    }
}
