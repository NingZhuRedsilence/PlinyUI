package display.views;

import display.viewModel.TaskView;

/**
 * Created by chenhaozhang on 5/29/16.
 */
public class ConsoleViewTask {
    private final TaskView _tv;

    public ConsoleViewTask(TaskView tv)
    {
        _tv = tv;
    }

    public void show()
    {
        System.out.println("Task title: " + _tv.title);
        System.out.println("Task status: " + _tv.currStatus);
        System.out.println("Task Deadline: " + _tv.dateTime);
    }
}
