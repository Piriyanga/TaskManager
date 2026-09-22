import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TaskManager taskManager = new TaskManager();

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("================================");
        System.out.println("       TASK MANAGER APP");
        System.out.println("================================");

        while (running) {
            displayMenu();

            int choice = readInteger("Choose an option: ");

            switch (choice) {
                case 1:
                    addTask();
                    break;

                case 2:
                    taskManager.listTasks();
                    break;

                case 3:
                    completeTask();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1 to 5.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("1. Add task");
        System.out.println("2. List tasks");
        System.out.println("3. Complete task");
        System.out.println("4. Delete task");
        System.out.println("5. Exit");
    }

    private static void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine().trim();

        if (title.isEmpty()) {
            System.out.println("Task title cannot be empty.");
            return;
        }

        taskManager.addTask(title);
    }

    private static void completeTask() {
        int id = readInteger("Enter the task ID to complete: ");

        if (taskManager.completeTask(id)) {
            System.out.println("Task completed successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    private static void deleteTask() {
        int id = readInteger("Enter the task ID to delete: ");

        if (taskManager.deleteTask(id)) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    private static int readInteger(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}