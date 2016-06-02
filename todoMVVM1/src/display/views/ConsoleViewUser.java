package display.views;

import display.viewModel.UserView;

/**
 * Created by chenhaozhang on 5/29/16.
 */
public class ConsoleViewUser {

    private final UserView _uv;

    public ConsoleViewUser(UserView uv)
    {
        _uv = uv;
    }

    public void show()
    {
        System.out.println("Hello, " + _uv.userName);

    }
}
