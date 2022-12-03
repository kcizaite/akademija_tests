
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(" ");
            int lastWordIndex = words.length - 1;
            System.out.println(words[lastWordIndex]);
        }
    }
}
