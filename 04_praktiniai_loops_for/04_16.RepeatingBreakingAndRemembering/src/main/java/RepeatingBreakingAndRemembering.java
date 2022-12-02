
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int number;
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            number = scanner.nextInt();
            if (number > -1) {
                sum += number;
                counter++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

                System.out.println(number);
            } else {
                System.out.println("Thx! Bye!");
                break;
            }

        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (double)sum/counter);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
