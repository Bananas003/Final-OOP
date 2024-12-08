public class LibraryItem implements Searchable {
    protected String title;
    protected int id;

    public LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Book ID: " + id);
    }

    @Override
    public boolean searchByTitle(String searchTitle) {
        return this.title.equalsIgnoreCase(searchTitle);
    }
}
