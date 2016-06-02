package edu.rice.cs.todo.controllers;

import edu.rice.cs.todo.models.Task;
import edu.rice.cs.todo.models.TaskRepository;
import edu.rice.cs.todo.view_models.TaskListViewModel;
import edu.rice.cs.todo.views.ListTasksView;
import edu.rice.cs.todo.views.MasterView;
import edu.rice.cs.todo.views.ToolbarView;
import edu.rice.cs.todo.views.TotalTasksView;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 5/31/2016.
 */
public class ToDoAppController
{
    private final TotalTasksView _totalsTaskView;

    private final ListTasksView _listTasksView;

    private final MasterView _masterView;

    public ToDoAppController(TaskRepository repos)
    {
        /**
         * Translate model to view model.
         */
        TaskListViewModel vm;
        {
            List<String> taskDescriptions = new LinkedList<>();

            for (Task task : repos.getTasks())
            {
                if (!task.Completed)
                    taskDescriptions.add(task.Description);
            }
            vm = new TaskListViewModel(taskDescriptions);
        }


        /**
         * Create views.
         */
        ToolbarView toolbarView = new ToolbarView();
        _totalsTaskView = new TotalTasksView(vm);
        _listTasksView = new ListTasksView(vm);
        _masterView = new MasterView(toolbarView, _listTasksView);

        /**
         * Wire-up views to respond to user actions.
         */
        toolbarView.OnListClicked.addListener(this::handleListButtonClicked);
        toolbarView.OnTotalsClicked.addListener(this::handleTotalsButtonClicked);
    }

    public void start()
    {
        _masterView.showView();
    }

    private void handleListButtonClicked(Void forget)
    {
        _masterView.setDisplayView(_listTasksView);
    }

    private void handleTotalsButtonClicked(Void forget)
    {
        _masterView.setDisplayView(_totalsTaskView);
    }
}
