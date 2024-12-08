public class DVD extends LibraryItem {
    private String director;

    public DVD(String title, int id, String director) {
        super(title, id);
        this.director = director;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Director: " + director);
    }
}
