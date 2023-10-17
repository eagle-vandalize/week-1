import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    private ArrayList<String> todoList = new ArrayList<>();

    public void displayList() {
        if (todoList.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    public void addTask(String task) {
        todoList.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < todoList.size()) {
            String removedTask = todoList.remove(taskIndex);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task index. Please try again.");
        }
    }

    public static void main(String[] args) {
        TodoListApp todoListApp = new TodoListApp();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display To-Do List");
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    todoListApp.displayList();
                    break;
                case 2:
                    System.out.print("Enter the task to add: ");
                    scanner.nextLine(); // Consume the newline character
                    String newTask = scanner.nextLine();
                    todoListApp.addTask(newTask);
                    break;
                case 3:
                    System.out.print("Enter the index of the task to remove: ");
                    int taskIndex = scanner.nextInt();
                    todoListApp.removeTask(taskIndex - 1); // Adjust for 0-based index
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

}
