package service;

import domain.Todo;
import repository.TodoRepository;

import java.util.List;

public class TodoService {

    private final TodoRepository repository;
    private long nextId = 1;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public Todo addTodo(String title) {
        Todo todo = new Todo(nextId++, title);
        repository.save(todo);
        return todo;
    }

    public List<Todo> getTodos() {
        return repository.findAll();
    }

    public void completeTodo(long id) {
        Todo todo = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("todo not found"));
        todo.complete();
    }

    public void deleteTodo(long id) {
        repository.delete(id);
    }
}
