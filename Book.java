public class Book {
    private String title;
    private Enum status;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, Enum status) {
        this.title = title;
        this.status = status;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }
}
