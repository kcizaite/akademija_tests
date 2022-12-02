
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int counter = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number != 0) {
                System.out.println("Give a number:");
                if (number < 0) {
                    counter++;
                }
            } else {
                System.out.println("Number of negative numbers: " + (counter));
                break;
            }
        }
    }
}
