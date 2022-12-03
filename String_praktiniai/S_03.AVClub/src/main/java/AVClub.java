import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(" ");

            for (String word : words) {
                if (word.matches(".*av.*")) {
                    System.out.println(word);
                }
            }
        }
    }
}
