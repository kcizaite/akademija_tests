
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int numberto = scanner.nextInt();
        System.out.println("Where from?");
        int numberfrom = scanner.nextInt();

        for (int i = numberfrom; i <= numberto; i++) {
            System.out.println(i);
        }
    }
}
