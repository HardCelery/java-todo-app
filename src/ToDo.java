public class ToDo {
    private String title;
    private boolean done;

    public ToDo(String title) {
        this.title = title;
        this.done = false;
    }

    public String getTitle() {
        return title;
    }
    public Boolean isDone() {
        return done;
    }

    public void Completed() {
        this.done = true;
    }

    /* public static int readInt() {

    } */
}