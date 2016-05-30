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
        System.out.println("To create a user, press 1; to log in, press 2");
        String choice = scanner.next();
        System.out.println("Please enter your username:");
        String userName = scanner.next();
        System.out.println("Please enter your password:");
        String password = scanner.next();
        List<UserAccount> users = new LinkedList<>();
        UserCtrlr userCtrlr = new UserCtrlr(users);

        if (choice.equals("1")) { //choice == "1" didn't return true
            userCtrlr.addAUser(userName, password);
        } else {
            userCtrlr.showAUser(userName, password);
        }

    }
}
