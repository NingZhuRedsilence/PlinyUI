package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenhaozhang on 5/28/16.
 */
public class UserAccount {
    private List<TaskModel> tasks;
    private String userName;
    private String password;
    //should have some kind of statistics of historical tasks?

    public UserAccount(String userName) {
        this.userName = userName;
        this.tasks = new ArrayList<TaskModel>();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TaskModel> getTasks() {
        return tasks;
    }

    public void setTasks(TaskModel task) {
        this.tasks.add(task);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
