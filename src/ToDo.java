public class ToDo {
    private String title;
    private boolean done;

    public String getTitle() {
        return title;
    }
    public Boolean isDone() {
        return done;
    }

    public void Completed() {
        this.done = true;
    }
}