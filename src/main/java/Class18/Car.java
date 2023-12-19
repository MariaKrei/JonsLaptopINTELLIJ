package Class18;

public class Car {
   private String make;
   private String model;
   private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;}
    public double calculateRentalPrice(double days, double price){
        double total=days*price;
        System.out.println(make+" "+model+"for rent for "+days+"days "+"will  cost "+ total);
return total;}}
class LuxuryCar extends Car{
    private double addition;
    public LuxuryCar(String make, String model, int year, double addition) {
        super(make, model, year);
        this.addition=addition;}
    public double calculateRentalPrice(double days, double price, double addition){
        double total=days*price+addition;
        return total;}}
class EconomyCar extends Car{
    public EconomyCar(String make, String model, int year) {
        super(make, model, year);}}
