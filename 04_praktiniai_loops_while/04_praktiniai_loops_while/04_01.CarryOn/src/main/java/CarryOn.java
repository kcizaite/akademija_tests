
import java.util.Objects;
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shall we carry on?");

        while (true){
            String string = scanner.nextLine();
            String no = "no";
            boolean b1 = !Objects.equals(string, no);
            if (b1) {
                System.out.println("Shall we carry on?");
            } else {
               break;
            }
        }
    }
}
