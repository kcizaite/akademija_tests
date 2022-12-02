
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning = scanner.nextInt();
        int end = scanner.nextInt();
        divisibleByThreeInRange(beginning, end);
    }
    private static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            boolean yo = i % 3 == 0;
            if (yo) {
                System.out.println(i);
            }
        }

    }

}
