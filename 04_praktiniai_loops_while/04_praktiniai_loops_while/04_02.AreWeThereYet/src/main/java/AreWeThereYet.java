
import java.util.Objects;
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        while (true){
            int number = scanner.nextInt();
            int four = 4;
            if (number != four) {
                System.out.println("Give a number:");
            } else {
                break;
            }
        }
    }
}
