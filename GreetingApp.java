public class GreetingApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Print greeting for multiple names
        System.out.print("Hello, ");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);

            // Add comma except for last name
            if (i < args.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("!");
    }
}