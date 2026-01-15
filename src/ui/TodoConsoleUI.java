package ui;

import controller.TodoController;
import domain.Todo;

import java.util.List;
import java.util.Scanner;

public class TodoConsoleUI {

    private final TodoController controller;

    public TodoConsoleUI(TodoController controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1:Add 2:List 3:Complete 4:Delete 0:Exit");
            int cmd = Integer.parseInt(scanner.nextLine());

            switch (cmd) {
                case 1 -> {
                    System.out.print("title: ");
                    controller.add(scanner.nextLine());
                }
                case 2 -> {
                    List<Todo> todos = controller.list();
                    todos.forEach(t ->
                        System.out.println(t.getId() + ":" + t.getTitle() +
                                (t.isCompleted() ? " [DONE]" : ""))
                    );
                }
                case 3 -> {
                    System.out.print("id: ");
                    long id = Long.parseLong(scanner.nextLine());
                    controller.complete(id);
                }
                case 4 -> {
                    System.out.print("id: ");
                    long id = Long.parseLong(scanner.nextLine());
                    controller.delete(id);
                }
                case 0 -> {
                    return;
                }
            }
        }
    }
}
