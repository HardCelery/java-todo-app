package domain;

public class Todo {

    private final long id;
    private String title;
    private boolean completed;

    public Todo(long id, String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("タスクが未入力です。");
        }
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    public void reopen() {
        this.completed = false;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }
}
