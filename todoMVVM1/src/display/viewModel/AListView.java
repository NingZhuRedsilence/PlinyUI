package display.viewModel;

import javafx.util.Pair;

import java.util.List;
import java.util.Map;

/**
 * Created by chenhaozhang on 5/29/16.
 */
public abstract class AListView {
    public final List<String[]> sortedTasks; // list of task info
    private TaskView _tv; //to show info of individual tasks
    public AListView(List<String[]> sortedTasks) {
        this.sortedTasks = sortedTasks;
    }

    public void showList(){

    }
}
