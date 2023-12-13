package Class15;

public class Book {
    private String name;
    private int year;
    private String color;
    private String writer;
    private int pages;

    public Book(String name, int year, String color, String writer) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.writer = writer;
    }
    public Book(String name, int year, String color, String writer, int pages) {
        this(name,year,color,writer);
        this.pages=pages;
    }





    public void PrintInfo(){
        System.out.println(name+" "+year+" "+color+" "+writer);
    }
    public void PrintInfoAll(){
        System.out.println(name+" "+year+" "+color+" "+writer+ " "+pages);}

    public static void main(String[] args) {
        Book a=new Book("Life", 2014, "White", "Kashl", 100);
        Book b=new Book("Happines", 2015, "Blue", "Kashl");
        b.PrintInfoAll();
        a.PrintInfo();
    }
    }