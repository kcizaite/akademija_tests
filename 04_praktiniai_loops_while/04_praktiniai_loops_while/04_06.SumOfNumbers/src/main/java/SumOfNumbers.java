
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();

            if (number != 0) {
                sum += number;
                System.out.println("Give a number:");

            } else {
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }
    }
}