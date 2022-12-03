import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> namesLength = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();

        int counter = 0;
        int sum = 0;
//        names and birth inputs
        while (true) {
            input = scanner.nextLine();
            counter++;
            if (input.equals("")) {
                break;
            }
            String[] text = input.split(",");
//            longest name
            int firstIndex = 0;
            String name = (text[firstIndex]);
            names.add(name);
            int nameLength = name.length();
            namesLength.add(nameLength);
//            average
            int lastIndex = text.length - 1;
            int birthYear = Integer.parseInt(text[lastIndex]);
            birthYears.add(birthYear);
        }

        int maxNameLength = Collections.max(namesLength);
        System.out.println("Longest name: " + names.get(namesLength.indexOf(maxNameLength)));
        for (Integer year : birthYears) {
            sum += year;
        }
        double avgBirth = (double)sum / (counter - 1);
        System.out.println("Average of the birth years: " + avgBirth);
    }
}
