package repository;

import domain.Todo;
import java.util.List;
import java.util.Optional;

public interface TodoRepository {

    // Todoの保存・更新をRepogitoryに委譲
    void save(Todo todo);

    // Todoを全件取得（0件でも可）
    List<Todo> findAll();

    // 指定IDのTodoを削除
    void delete(long id);

    // 指定IDのTodoを取得
    Optional<Todo> findById(long id);
}
