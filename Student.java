public class Student extends LibraryUser {
    public Student(String name) {
        super(name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.println(name + " borrowed: " + item.title);
    }
}
