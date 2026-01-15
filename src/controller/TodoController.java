package controller;

import domain.Todo;
import service.TodoService;

import java.util.List;

public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    public void add(String title) {
        service.addTodo(title);
    }

    public List<Todo> list() {
        return service.getTodos();
    }

    public void complete(long id) {
        service.completeTodo(id);
    }

    public void delete(long id) {
        service.deleteTodo(id);
    }
}
