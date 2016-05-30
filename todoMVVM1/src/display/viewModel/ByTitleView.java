package display.viewModel;

import jdk.internal.util.xml.impl.Pair;

import java.util.List;
import java.util.Map;

/**
 * Created by chenhaozhang on 5/29/16.
 * Show a list of task, can be sorted by titles, schedule (date & time) and status
 */
public class ByTitleView extends AListView {
    public ByTitleView(List<String[]> sortedTasks) {
        super(sortedTasks);
    }
}
