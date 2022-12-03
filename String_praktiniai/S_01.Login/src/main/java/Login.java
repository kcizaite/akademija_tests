
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName1 = "alex";
        String userName2 = "emma";
        String passwd1 = "sunshine";
        String passwd2 = "haskell";

        System.out.println("Enter username:");
        String inputUserName = scanner.nextLine();
        System.out.println("Enter password:");
        String inputPasswd = scanner.nextLine();

        if ((inputUserName.equals(userName1) && inputPasswd.equals(passwd1))
                || (inputUserName.equals(userName2) && inputPasswd.equals(passwd2))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}