
public class Printer {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i <= array.length -1; i++) {
            String star = "*";
            for (int j = 0; j <= array[i] -1; j++) {
                System.out.print(star);
            }
            System.out.println("");
        }
    }
}
