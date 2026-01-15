package repository;

import domain.Todo;
import java.util.*;

public class InMemoryTodoRepository implements TodoRepository {

    private final Map<Long, Todo> store = new HashMap<>();

    @Override
    public void save(Todo todo) {
        store.put(todo.getId(), todo);
    }

    @Override
    public Optional<Todo> findById(long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void delete(long id) {
        store.remove(id);
    }
}
