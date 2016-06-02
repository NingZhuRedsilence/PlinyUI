package display;

import model.UserAccount;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chenhaozhang on 5/28/16.
 */
public class TodoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<UserAccount> users = new LinkedList<>();
        UserCtrlr userCtrlr = new UserCtrlr(users);
        userCtrlr.addAUser("default", "default");
        while(true) {
            System.out.println("\nTo create a user, press 1; to log in, press 2");
            String choice = scanner.next();
            if (choice.equals("2")) { //choice == "2" didn't return true
                System.out.println("Use username 'default' and password 'default' to log in.");
            }
            System.out.println("Please enter your username:");
            String userName = scanner.next();
            System.out.println("Please enter your password:");
            String password = scanner.next();

            if (choice.equals("1")){
                userCtrlr.addAUser(userName, password);
            }

            userCtrlr.showAUser(userName, password);

        }

    }
}
