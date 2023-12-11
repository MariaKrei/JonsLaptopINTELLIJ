package Class15;

public class Book {
    private String car;
    private int year;
    private String color;
    public Book(String car, int year, String color) {
        this.car = car;
        this.year = year;
        this.color = color;
    }
    public Book(int year, String color, String car){
            this.car = car;
            this.year = year;
            this.color = color;
        }public void PrintInfo(){
        System.out.println(car+" "+year+" "+color);
    }

    public static void main(String[] args) {
        Book a=new Book("BMW", 2014, "White");
        Book b=new Book("BMW", 2014, "White");
        b.PrintInfo();
        a.PrintInfo();
    }
    }