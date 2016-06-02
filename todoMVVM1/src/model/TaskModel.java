package model;

import java.rmi.server.UID;
import java.util.UUID;

/**
 * Created by chenhaozhang on 5/28/16.
 */
public class TaskModel {

    public UUID getIndex() {
        return index;
    }

    private UUID index;
    private String title;
    private Schedule schedule;
    private String taskStatus;

    public TaskModel(String title) {
        this.index = UUID.randomUUID();
        this.title = title;
        this.taskStatus = "unscheduled";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}
