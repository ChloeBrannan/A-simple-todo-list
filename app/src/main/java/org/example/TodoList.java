package org.example;
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks = new ArrayList<>();
    private ArrayList<Boolean> status = new ArrayList<>();

    public void add(String task) {
        if (task != null && !task.isEmpty()) {
            tasks.add(task);
            status.add(false);
        }
    }

    public void complete(int i) {
        if (i >= 0 && i < status.size()) {
            status.set(i, true);
        }
    }

    public void show(String type) {
        for (int i = 0; i < tasks.size(); i++) {
            boolean done = status.get(i);
            if (type.equals("all") || (type.equals("done") && done) || (type.equals("open") && !done)) {
                System.out.println(i + ". " + (done ? "[X] " : "[ ] ") + tasks.get(i));
            }
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public boolean isTaskComplete(int i) {
        if (i >= 0 && i < status.size()) {
            return status.get(i);
        }
        return false;
    }

    public void clear() {
        tasks.clear();
        status.clear();
    }
}