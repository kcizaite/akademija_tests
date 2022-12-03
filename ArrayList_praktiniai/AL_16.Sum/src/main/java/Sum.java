
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            numbers.add(input);
        }
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int suma = 0;
        for (Integer number : numbers) {
            suma += number;

        }
        return suma;
    }

}