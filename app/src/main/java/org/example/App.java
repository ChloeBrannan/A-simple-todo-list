package org.example;
import java.util.ArrayList;

public class App {
  ArrayList<String> tasks = new ArrayList<>();
  ArrayList<Boolean> status = new ArrayList<>();

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

  // This method is required by your Driver
  public void show(String type) {
    for (int i = 0; i < tasks.size(); i++) {
      boolean done = status.get(i);
      if (type.equals("all") || (type.equals("done") && done) || (type.equals("open") && !done)) {
        System.out.println(i + ". " + (done ? "[X] " : "[ ] ") + tasks.get(i));
      }
    }
  }

  // These methods are required by your AppTest
  public int getTaskCount() {
    return tasks.size();
  }

  public boolean isTaskComplete(int i) {
    return status.get(i);
  }

  public void clear() {
    tasks.clear();
    status.clear();
  }

  public void show(String all) {
  }
}