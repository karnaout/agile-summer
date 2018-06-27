/**
 * Class HelloWorld
 * This Class prints the name passed (as String) into the command line argument.
 * Version 1.0
 */
public class HelloWorld {
    /**
     *
     * main() method. This is the entry point to this program.
     * @param args Command line argument(s).
     *
     */
    public static void main(String[] args) {
        try {
            System.out.print("Hello, " + args[0] + "!");
        } catch (IndexOutOfBoundsException e) {
            System.out.print("Missing argument! Please supply a name :)");
        }
    }
}
