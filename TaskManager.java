import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String title) {
        Task task = new Task(nextId, title);
        tasks.add(task);
        nextId++;

        System.out.println("Task added successfully.");
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("There are no tasks.");
            return;
        }

        System.out.println();
        System.out.println("Your tasks:");

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public boolean completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markCompleted();
                return true;
            }
        }

        return false;
    }

    public boolean deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                return true;
            }
        }

        return false;
    }
}