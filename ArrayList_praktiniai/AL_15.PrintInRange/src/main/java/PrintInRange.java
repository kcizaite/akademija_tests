import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();
        printNumbersInRange(numbers, lowerLimit, upperLimit);
    }

    private static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
