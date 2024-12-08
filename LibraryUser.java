public abstract class LibraryUser {
    protected String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public abstract void borrowItem(LibraryItem item);

    public void printUser() {
        System.out.println("User: " + name);
    }
}
