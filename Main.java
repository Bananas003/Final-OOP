import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("Home is where the heart is", 518, "Grace Evans");
        LibraryItem dvd = new DVD("OOP Things", 122, "Blueberry Muary");

        book.displayDetails();
        dvd.displayDetails();

        
        ArrayList<Searchable> items = new ArrayList<>();
        items.add(book);
        items.add(dvd);

        String searchTitle = "Home is where the heart is";
        for (Searchable item : items) {
            if (item.searchByTitle(searchTitle)) {
                System.out.println("Found: " + searchTitle);
            }
        }

        
        LibraryUser student = new Student("Keanna");
        student.printUser();
        student.borrowItem(book);
    }
}
