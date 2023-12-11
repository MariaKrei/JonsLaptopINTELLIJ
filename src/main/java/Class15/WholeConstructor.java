package Class15;

public class WholeConstructor {
   private String name;
   private int age;
   private String nationality;
   private String favFood;
  public  WholeConstructor(String pName,int pAge, String pNationality,String pFavFood ) {
      name = pName;
      age = pAge;
      nationality = pNationality;
      favFood = pFavFood;
  }
  public void printInfo() {
      System.out.println(name + " " + age + " " + nationality + " " + favFood);

  }

    public static void main(String[] args) {
        WholeConstructor b=new WholeConstructor("Maria", 35, "Russian", "Pelmeni");
    b.printInfo();}}