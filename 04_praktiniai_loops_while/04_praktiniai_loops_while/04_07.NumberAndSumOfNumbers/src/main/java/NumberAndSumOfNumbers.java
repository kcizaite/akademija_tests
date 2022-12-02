
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int sum = 0;
        int count = 0;
        while (true) {
            int number = scanner.nextInt();

            if (number != 0) {
                sum += number;
                count++;
                System.out.println("Give a number:");

            } else {
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }
    }
}
