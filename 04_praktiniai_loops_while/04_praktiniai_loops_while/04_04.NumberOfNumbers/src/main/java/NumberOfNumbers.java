
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int counter = 0;
        while (true){

            int number = scanner.nextInt();
            if (number != 0) {
                counter++;
                System.out.println("Give a number:");
            } else {
                System.out.println("Number of numbers: " + (counter));
                break;
            }
        }
    }
}
