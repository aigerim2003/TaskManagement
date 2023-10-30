package com.example.taskmanagement;
import java.util.Date;
public class MeetingTask implements Task {
    private String taskName;
    private String taskDescription;
    private boolean isComplete;
    private Priority priority;
    private Date deadline;

    @Override
    public void setTask(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    @Override
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Override
    public void markAsComplete() {
        isComplete = true;
    }

    @Override
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public void setDeadline(Date date) {
        deadline = date;
    }

    @Override
    public String toString() {
        return "Meeting Task: " + taskName + "\nDescription: " + taskDescription + "\nPriority: " + priority + "\nDeadline: " + deadline;
    }
}

