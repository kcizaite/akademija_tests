
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Search for?");
        int search = scanner.nextInt();
        ArrayList<Integer> matching = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element == search) {
                matching.add(i);
            }
        }
        for (Integer integer : matching) {
            System.out.println(search + " is at index " + integer);
        }
    }
}
