
import java.util.Scanner;

public class AverageOfNumbers {

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
                double ave = (double) sum / count;
                System.out.println("Average of the numbers: " + ave);
                break;
            }
        }
    }
}
