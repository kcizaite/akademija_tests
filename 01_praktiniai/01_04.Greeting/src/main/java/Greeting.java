
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Write your program here
        System.out.println("What's your name?");
        System.out.println("Hi " + name);
    }
}
