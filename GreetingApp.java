public class GreetingApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join all names with comma
        String names = String.join(", ", args);

        System.out.println("Hello, " + names + "!");
    }
}