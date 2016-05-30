package display.viewModel;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Show a single task, including title, date, time & status
 * Created by chenhaozhang on 5/29/16.
 */
public class TaskView {
    public final String title;
    public final String dateTime;
    public final String currStatus;

    public TaskView(String title, String dateTime, String currStatus) {
        this.title = title;
        this.dateTime = dateTime;
        this.currStatus = currStatus;
    }
}
