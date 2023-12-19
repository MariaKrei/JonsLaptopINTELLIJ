package Class18;

public class Book {
    private String title;
    private String author;
    private int ISBN;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public void displayInfo(){
        System.out.println("Name of the book is " +title + "author is  "+ author+" ISBN is "+ISBN);
    }
}

class Ebook extends Book{
    private String link;

    public Ebook(String title, String author, int ISBN, String link) {
        super(title, author, ISBN);
        this.link = link;}
        public void displayInfo(){
        super.displayInfo();
            System.out.println("Please download book at link"+link);
        }
    }

class PrintBook extends Book{
    private int copies;

    public PrintBook(String title, String author, int ISBN, int copies) {
        super(title, author, ISBN);
        this.copies = copies;
    }public void displayInfo(){
        super.displayInfo();
        System.out.println("We prepared for you "+copies+" copies");
}}
