public class GreetingApp {
    public static void main(String[] args) {

        String name;

        // Check if user provided argument
        if (args.length == 0) {
            name = "World";
        } else {
            name = args[0]; // take first argument
        }

        System.out.println("Hello, " + name + "!");
    }
}