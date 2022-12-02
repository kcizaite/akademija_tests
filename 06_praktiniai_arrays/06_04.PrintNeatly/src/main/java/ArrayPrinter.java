import java.util.Arrays;

public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int arr:array) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(arr);
        }
        System.out.println(sb);
        }
    }