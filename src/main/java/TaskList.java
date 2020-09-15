import java.util.ArrayList;

import duke.tasks.Task;

public class TaskList {
    private ArrayList<Task> taskList;
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public ArrayList<Task> getTasks() {
        return this.taskList;
    }

    public void add(Task newTask) {
        this.taskList.add(newTask);
    }

    public Task get(int index) {
        return this.taskList.get(index);
    }

    public int numTask() {
        return this.taskList.size();
    }

    public void list() {
        for(int i = 0; i < this.taskList.size(); i++) {
            String currentLine = "      "+ (i + 1) + ". " + this.taskList.get(i);
            System.out.println(currentLine);
        }
    }

    public Task removeTask(int index) {
        return this.taskList.remove(index);
    }
}