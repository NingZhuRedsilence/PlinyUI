package display;

import display.viewModel.AListView;
import display.viewModel.ByScheduleView;
import display.viewModel.TaskView;
import model.TaskModel;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/**
 * Create, edit, delete and show Task info
 * Created by chenhaozhang on 5/28/16.
 */
public class TaskCtrlr {
    private TaskModel task;
    //should the list of tasks sit here or in TodoApp or UserCtrlr?
    //need to connect the list with a user account? Sounds like in TodoApp?
    //Or should user intrinsically have a reference to the list?
    //What if it's not a list or not a todo something?
    //So, here?
    private List<TaskModel> tasks;
    //private AListView listView;

    public TaskCtrlr(List<TaskModel> tasks) {
        this.tasks = tasks;
    }

    public void createTask(String title) {
        task = new TaskModel(title);
        tasks.add(task);
    }

    public void modifyTask() {}

//    public void showTaskList(int choiceKey) {
//        String[] taskToShow = new String[3];
//        AListView listToShow = new
//        for (TaskModel task : this.tasks) {
//            taskToShow[0] = task.getTitle();
//            taskToShow[1] = task.getSchedule().toString();
//            taskToShow[2] = task.getTaskStatus();
//
//        }
//    }

    public void showTask(String title) {

        for(TaskModel task : this.tasks)
        {
            if(task.getTitle().equals(title))
            {
                String dateTime = task.getSchedule().toString();
                String status = task.getTaskStatus();
                TaskView tv = new TaskView(title, dateTime, status);

                //new ConsoleView(tv).show();
            }
        }
    }

    public void showTaskList(String choice) {
        //Collections.sort(tasks, new Comparator<TaskModel>() {
//            public int compare(TaskModel t1, TaskModel t2) {
//                switch (_choiceKey) {
//                    case 1:
//                        listView = new ByScheduleView();
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                }
//                if (t1.getDateTime() == null || t2.getDateTime() == null)
//                    return 0;
//                return t1.getDateTime().compareTo(t2.getDateTime());
//            }
//        });

        //    Collections.sort(myList, new Comparator<MyObject> {
//        public int compare(MyObject o1, MyObject o2) {
//            DateTime a = o1.getDateTime();
//            DateTime b = o2.getDateTime();
//            if (a.lt(b))
//                return -1;
//            else if (a.lteq(b)) // it's equals
//                return 0;
//            else
//                return 1;
//        }
//    });

    }

}
