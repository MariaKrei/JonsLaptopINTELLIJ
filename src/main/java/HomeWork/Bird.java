package HomeWork;

public class Bird {
    private String name;
    private double weight;
    private int lengthOfLife;
    private boolean isCarnivore;
    public Bird(String name, double weight, int lengthOfLife, boolean isCarnivore) {
        this.name = name;
        this.weight = weight;
        this.lengthOfLife = lengthOfLife;
        this.isCarnivore = isCarnivore;
    }
    public void printInfo(){
        System.out.println("name "+name+" weight  "+weight+" length of life  "+lengthOfLife+" Is carnivore? "+isCarnivore);
    }
}
class Parrot extends Bird{
    public Parrot(String name, double weight, int lengthOfLife, boolean isCarnivore) {
        super(name, weight, lengthOfLife, isCarnivore);
    }
    public static void main(String[] args) {
        Parrot n=new Parrot("Parrot", 1, 15, false);
        n.printInfo();
    }
}

