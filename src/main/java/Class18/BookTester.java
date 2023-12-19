package Class18;

public class BookTester {
    public static void main(String[] args) {
        Book b=new Book("War and Peace", "Tolstoy", 123445);
        PrintBook p=new PrintBook("Twins", "Lady M", 123654, 5);
        Ebook e=new Ebook("Mowgli", "Unknown", 123987, "http/books.com");
        b.displayInfo();
        p.displayInfo();
        e.displayInfo();
    }
}
