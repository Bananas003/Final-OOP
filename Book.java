public class Book extends LibraryItem {
    private String author;

    public Book(String title, int id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}
