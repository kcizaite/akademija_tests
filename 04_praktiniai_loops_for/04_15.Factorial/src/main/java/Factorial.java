
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = scanner.nextInt();

        long fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        System.out.println(fac);
    }
}
