import controller.TodoController;
import repository.InMemoryTodoRepository;
import repository.TodoRepository;
import service.TodoService;
import ui.TodoConsoleUI;

public class TodoApplication {

    public static void main(String[] args) {

        // Repository（保存方法）
        TodoRepository repository = new InMemoryTodoRepository();

        // Service（業務ロジック）
        TodoService service = new TodoService(repository);

        // Controller（交通整理）
        TodoController controller = new TodoController(service);

        // UI（画面）
        TodoConsoleUI ui = new TodoConsoleUI(controller);

        // アプリ開始
        ui.start();
    }
}
