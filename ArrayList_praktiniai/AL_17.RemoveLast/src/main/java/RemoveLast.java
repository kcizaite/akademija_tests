import java.util.ArrayList;
import java.util.Scanner;

public class RemoveLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            }
            strings.add(word);
        }
        System.out.println(strings);
        removeLast(strings);
        System.out.println(strings);
    }
    private static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            int lastIndex = strings.size() - 1;
            String lastWord = strings.get(lastIndex);
            strings.remove(lastWord);
        }
    }
}
