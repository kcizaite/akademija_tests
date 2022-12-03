import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            count++;
            list.add(number);
        }
        System.out.println("");
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("Average: " + (double) sum / count);
    }
}
