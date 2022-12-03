
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] text = input.split(",");
            int lastIndex = text.length - 1;
            int age = Integer.parseInt(text[lastIndex]);
            ages.add(age);
            int maxAge = Collections.max(ages);

            int firstIndex = 0;
            String name = (text[firstIndex]);
            names.add(name);
            System.out.println("Name of the oldest: " + names.get(ages.indexOf(maxAge)));
        }
    }
}
