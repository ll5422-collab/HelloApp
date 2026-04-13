public class GreetingApp {
    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Print greeting using enhanced for loop
        System.out.print("Hello, ");

        int count = 0;
        for (String name : args) {
            count++;
            if (count == args.length) {
                System.out.print(name); // last name (no comma)
            } else {
                System.out.print(name + ", ");
            }
        }

        System.out.println("!");
    }
}