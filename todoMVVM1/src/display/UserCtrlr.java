package display;

import display.viewModel.UserView;
import display.views.*; // if write ConsoleViewUser here, Intellij can't recoganize it?
import model.UserAccount;

import java.util.List;

/**
 * Create, edit, delete and show user info
 * Created by chenhaozhang on 5/28/16.
 */
public class UserCtrlr {
    private List<UserAccount> _users;

    UserCtrlr(List<UserAccount> users)
    {
        _users = users;
    }

    public void showAUser(String userName, String password)
    {
        for(UserAccount user : _users)
        {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password))
            {
                String outPutUserName = user.getUserName();
                UserView uv = new UserView(outPutUserName);

                new ConsoleViewUser(uv).show();
            }
        }
    }

    public void addAUser(String userName, String password) {
        UserAccount newUser = new UserAccount(userName);
        newUser.setPassword(password);
        _users.add(newUser);
        System.out.println("Added a new account " + userName);
    }
}
