import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();
        division(numerator, denominator);
    }
    private static void division(int numerator, int denominator) {
        System.out.println((double)numerator/denominator);
    }
}
