
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        Integer min = Collections.min(list);
        System.out.println("Smallest number: " + min);
        ArrayList<Integer> smallest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element == min) {
                smallest.add(i);
            }
        }

        for (Integer integer : smallest) {
            System.out.println("Found at index: " + integer);
        }
    }
}

