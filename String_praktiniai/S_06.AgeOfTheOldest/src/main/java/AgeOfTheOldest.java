
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        ArrayList<Integer> ages = new ArrayList<>();
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] text = input.split(",");
            int lastIndex = text.length - 1;
            int age = Integer.parseInt(text[lastIndex]);
            ages.add(age);
            System.out.println(Collections.max(ages));
        }
    }
}
